package com.cisko.countrygame.economy.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private int id;
    private int profit;
    private int employeeCount;
    private String name;
    private List<CompanyHistory> companyHistoryList;

    public static Company of(int id, int profit, int employeeCount, String name, List<CompanyHistory> companyHistoryList) {
        return new Company(id, profit, employeeCount, name, companyHistoryList);
    }
}
