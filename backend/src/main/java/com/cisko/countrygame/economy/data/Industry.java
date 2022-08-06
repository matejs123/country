package com.cisko.countrygame.economy.data;

import lombok.Data;

import java.util.List;

@Data
public class Industry {
    private int id;
    private String name;
    private int gdp;
    private List<Company> companyList;
}
