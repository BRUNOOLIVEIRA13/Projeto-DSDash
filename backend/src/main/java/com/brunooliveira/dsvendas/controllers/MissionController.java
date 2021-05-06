package com.brunooliveira.dsvendas.controllers;

import com.brunooliveira.dsvendas.dto.MissionDTO;
import com.brunooliveira.dsvendas.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/missions")
public class MissionController {

    @Autowired
    private MissionService service;

    //No corpo da resposta irá retornar a lista
    @GetMapping
    public ResponseEntity<Page<MissionDTO>> findAll(Pageable pageable){
        Page<MissionDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
