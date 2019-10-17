package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculations.BelgianTaxCalculationCalculation;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TaxCalculatorTest {

    @Mock
    BelgianTaxCalculationCalculation belgianTaxCalculationCalculation;

    @InjectMocks
    TaxCalculator taxCalculator;

    @Test
    void test() {
        Mockito.when(belgianTaxCalculationCalculation.calculateTaxes(23000)).thenReturn(10350.0);

        double calculateBelgianTaxes = taxCalculator.calculateTaxesBasedOnYearlyIncome(23000);

        Assertions.assertEquals(calculateBelgianTaxes, 10350.0);
    }
}