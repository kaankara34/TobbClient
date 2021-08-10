package com.aegon.tobbclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindAcenteRequest {

    private String vergiKimlikNo;
    private String user;

}
