package com.switchfully.springdi.taxcalculations;

import org.springframework.stereotype.Component;

@Component
public class AmericanTaxCalculationCalculation implements TaxCalculation {

    private static final double TAX_RATE = 0.18;
    private static final int LUMP_SUM = 950;

    @Override
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * TAX_RATE + LUMP_SUM;
    }
}
