package com.aegon.tobbclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ruhsat {
    private String ruhsatAdi;
    private String dokumanNumarasi;
    private String aciklama;
    private XMLGregorianCalendar dokumanTarihi;
}

