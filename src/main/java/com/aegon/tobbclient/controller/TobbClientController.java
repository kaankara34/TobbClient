package com.aegon.tobbclient.controller;

import com.aegon.cnf.support.rest.ResponseBuilder;
import com.aegon.cnf.support.rest.dto.ServiceResponse;
import com.aegon.tobbclient.model.FindAcenteRequest;
import com.aegon.tobbclient.model.GetAcenteResponse;
import com.aegon.tobbclient.service.TobbClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TobbClientController {

    private final TobbClientService tobbClientService;

    @GetMapping("/acente-bilgileri")
    public ResponseEntity<ServiceResponse<GetAcenteResponse>> getAcenteBilgileri(@RequestParam(value = "vergiKimlikNo", required = true) String vergiKimlikNo) throws Exception {
        FindAcenteRequest findAcenteRequest = new FindAcenteRequest();
        findAcenteRequest.setVergiKimlikNo(vergiKimlikNo);
        return ResponseBuilder.success(tobbClientService.findAcente(findAcenteRequest));

    }

}
