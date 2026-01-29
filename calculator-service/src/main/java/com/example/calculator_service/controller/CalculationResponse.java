package com.example.calculator_service.controller;

public class CalculationResponse {
    private double averageSalary;
    private int vacationDays;
    private double vacationPay;

    public CalculationResponse(double averageSalary, int vacationDays, double vacationPay)
    {
        this.averageSalary = averageSalary;
        this.vacationDays = vacationDays;
        this.vacationPay = vacationPay;
    }

    public double getAvarageSalary(){ return averageSalary; }
    public double getVacationDays(){ return vacationDays; }
    public double getVacationPay(){ return vacationPay; }
}
