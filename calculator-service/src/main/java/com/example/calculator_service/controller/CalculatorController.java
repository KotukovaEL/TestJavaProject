package com.example.calculator_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator_service.service.VacationCalculationService;

@RestController
public  class CalculatorController
{
    @Autowired
    private VacationCalculationService calculationService;

    @GetMapping("/calculate")
    public CalculationResponse calculate(
        @RequestParam("averageSalary") double averageSal,
        @RequestParam("vacationDays") int days) {
            double vacationPay = calculationService.calculateVacationPay(averageSal, days);
            return new CalculationResponse(averageSal, days, vacationPay);
        }
}