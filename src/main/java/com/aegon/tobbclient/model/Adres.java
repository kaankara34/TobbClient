package com.aegon.tobbclient.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adres {
    private int adresTipi;
    private int merkezSube;
    private int subeKodu;
    private String il;
    private String ilce;
    private String acikAdres;
    private String adresi;
    private ArrayList<String> listIpAdress = new ArrayList<String>();
}
