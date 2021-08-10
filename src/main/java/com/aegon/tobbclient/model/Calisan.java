package com.aegon.tobbclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calisan {
    private String tcKimlikNo;
    private String adi;
    private String soyadi;
    private String sicilNo;
    private String kayitDurumuAdi;
    private String calisanTipiAdi;
    private XMLGregorianCalendar baslangicTarihi;
    private XMLGregorianCalendar bitisTarihi;
    private ArrayList<Ruhsat> ruhsatList = new ArrayList<>();
}
