package com.aegon.tobbclient.service.impl;

import com.aegon.tobbclient.exception.AcenteNotFoundException;
import com.aegon.tobbclient.model.*;
import com.aegon.tobbclient.service.TobbClientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.tempuri.Acente;
import org.tempuri.ArrayOfAcente;
import org.tempuri.SigSirketWS;
import org.tempuri.SigSirketWSSoap;
import org.xml.sax.InputSource;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@RequiredArgsConstructor
public class TobbClientServiceImpl implements TobbClientService {

    private final SigSirketWSSoap client;
    private final ModelMapper modelMapper;

    @Value("${tobb.client.user}")
    private String USER;

    @Override
    public GetAcenteResponse findAcente(FindAcenteRequest findAcenteRequest) throws Exception {
        findAcenteRequest.setUser(USER);
        String levhaNo = "";
        ArrayOfAcente acente = client.findAcente(findAcenteRequest.getVergiKimlikNo(), findAcenteRequest.getUser());
        if (!StringUtils.isEmpty(acente) && !StringUtils.isEmpty(acente.getAcente()) && !acente.getAcente().isEmpty()) {

            levhaNo = acente.getAcente().get(0).getLevhaNo();

            GetAcenteRequest getAcenteRequest = new GetAcenteRequest(levhaNo, USER);
            return getAcente(getAcenteRequest);
        } else {
            throw new AcenteNotFoundException("Vergi Kimlik No veya User bilgisi yanlış");
        }
    }

    @Override
    public GetAcenteResponse getAcente(GetAcenteRequest getAcenteRequest) throws Exception {
        Acente tobbAcente = client.getAcente(getAcenteRequest.getLevhaNo(), getAcenteRequest.getUser());
        GetAcenteResponse response = new GetAcenteResponse();
        com.aegon.tobbclient.model.Acente acente = new com.aegon.tobbclient.model.Acente();
        acente = modelMapper.map(tobbAcente, com.aegon.tobbclient.model.Acente.class);
        response.setAcente(acente);
        ArrayList<Adres> adresList = new ArrayList<>();
        if (!StringUtils.isEmpty(tobbAcente.getAdreslist()) && !StringUtils.isEmpty(tobbAcente.getAdreslist().getAdres())) {
            Type listType = new TypeToken<List<Adres>>(){}.getType();
            adresList = modelMapper.map(tobbAcente.getAdreslist().getAdres(),listType);

        }
        response.setAdresList(adresList);
        ArrayList<Calisan> calisanList = new ArrayList<>();
        if (!StringUtils.isEmpty(tobbAcente.getCalisanlist()) && !StringUtils.isEmpty(tobbAcente.getCalisanlist().getCalisan())) {
            Type listType = new TypeToken<List<Calisan>>(){}.getType();
            calisanList = modelMapper.map(tobbAcente.getCalisanlist().getCalisan(),listType);
            for (Calisan calisan: calisanList) {
                if(calisan.getBaslangicTarihi()!=null) {
                    XMLGregorianCalendar baslangicTarihi =calisan.getBaslangicTarihi();
                    baslangicTarihi.setTimezone(0);
                    calisan.setBaslangicTarihi(baslangicTarihi);
                }
                if(calisan.getBitisTarihi()!=null) {
                    XMLGregorianCalendar bitisTarihi = calisan.getBitisTarihi();
                    bitisTarihi.setTimezone(0);
                    calisan.setBitisTarihi(bitisTarihi);
                }




            }
        }

        response.setCalisanList(calisanList);
        return response;


    }
}
