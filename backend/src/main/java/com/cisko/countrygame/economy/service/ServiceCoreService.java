package com.cisko.countrygame.economy.service;

import com.cisko.countrygame.economy.data.ServiceDTO;
import com.cisko.countrygame.economy.mapper.ServiceMapper;
import com.cisko.countrygame.economy.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ServiceCoreService {

    private final ServiceRepository serviceRepository;
    private final ServiceMapper mapper;

    public ServiceCoreService(ServiceRepository serviceRepository, ServiceMapper mapper) {
        this.serviceRepository = serviceRepository;
        this.mapper = mapper;
    }

    public List<ServiceDTO> findAll() {
        return serviceRepository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }
}
