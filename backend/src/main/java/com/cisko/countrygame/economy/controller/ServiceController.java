package com.cisko.countrygame.economy.controller;

import com.cisko.countrygame.economy.data.ServiceDTO;
import com.cisko.countrygame.economy.service.ServiceCoreService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "v1/api/service/")
public class ServiceController {

    private final ServiceCoreService serviceCoreService;

    public ServiceController(ServiceCoreService serviceCoreService) {
        this.serviceCoreService = serviceCoreService;
    }

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<ServiceDTO>> getServices() {
         return ResponseEntity.ok(serviceCoreService.findAll());
    }

}
