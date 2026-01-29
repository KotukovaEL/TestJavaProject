package com.example.calculator_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.calculator_service.service.VacationCalculationService;

@SpringBootTest
class CalculatorServiceApplicationTests{

	private VacationCalculationService vacationCalculationService;

	@BeforeEach
    void setUp()
	{
        vacationCalculationService = new VacationCalculationService();
    }

	@Test
	void calculate_vacation_pay_when_numbers_positive_correctly()
	{
		double avarageSalary = 50000;
		int vacationDays = 14;
		double expectedResult = avarageSalary / 29.3 * vacationDays;

		double actualResult = vacationCalculationService.calculateVacationPay(avarageSalary, vacationDays);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculate_vacation_pay_where_avarage_salary_negative_correctly()
	{
		double avarageSalary = -50000;
		int vacationDays = 14;

		assertThrows(
			IllegalArgumentException.class,
			() -> vacationCalculationService.calculateVacationPay(avarageSalary, vacationDays));
	}

	@Test
	void calculate_vacation_pay_where_vacation_days_negative_correctly()
	{
		double avarageSalary = -50000;
		int vacationDays = 14;

		assertThrows(
			IllegalArgumentException.class,
			() -> vacationCalculationService.calculateVacationPay(avarageSalary, vacationDays));
	}
}
