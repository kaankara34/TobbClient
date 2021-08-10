package com.aegon.tobbclient.service;

import com.aegon.tobbclient.model.FindAcenteRequest;
import com.aegon.tobbclient.model.GetAcenteRequest;
import com.aegon.tobbclient.model.GetAcenteResponse;
import org.springframework.stereotype.Service;

import javax.xml.parsers.ParserConfigurationException;


public interface TobbClientService {

    GetAcenteResponse findAcente(FindAcenteRequest findAcenteRequest) throws Exception;

    GetAcenteResponse getAcente(GetAcenteRequest getAcenteRequest) throws Exception;

}
