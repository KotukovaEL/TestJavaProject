package com.example.calculator_service.service;
import org.springframework.stereotype.Service;

@Service
public class VacationCalculationService {

    private static final double averageDaysInMonth  = 29.3;

    public  double calculateVacationPay(double averageSalary, int vacationDays) {
        validate(averageSalary, vacationDays);
        double averageDailyEarnings = averageSalary / averageDaysInMonth;
        return averageDailyEarnings * vacationDays;
    }

    private void validate(double averageSalary, int vacationDays) {
        if (averageSalary<=0) {
            throw  new IllegalArgumentException("Средняя зарплата должна быть положительной");
        }

        if (vacationDays<=0) {
            throw  new IllegalArgumentException("Количество дней отпуска должно быть положительным");
        }

    }
}
