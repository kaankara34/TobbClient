package com.aegon.tobbclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAcenteRequest {
    private String levhaNo;
    private String user;
}
