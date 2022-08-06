package com.cisko.countrygame.economy.data;

import lombok.Data;

import java.util.List;

@Data
public class Economy {
    private int id;
    private List<Industry> industryList;
    private List<ServiceDTO> serviceDTOList;
    private Tourism tourism;
}
