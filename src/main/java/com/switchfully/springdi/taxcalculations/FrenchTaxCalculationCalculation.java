package com.switchfully.springdi.taxcalculations;

import org.springframework.stereotype.Component;

@Component
public class FrenchTaxCalculationCalculation implements TaxCalculation {

    private static final double TAX_RATE = 0.48;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
