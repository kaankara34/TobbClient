package com.aegon.tobbclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAcenteResponse {
    private Acente acente;
    private ArrayList <Calisan> calisanList = new ArrayList<>();
    private ArrayList<Adres> adresList = new ArrayList<>();
}
