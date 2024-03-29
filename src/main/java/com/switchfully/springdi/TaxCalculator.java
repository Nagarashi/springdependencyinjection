package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculations.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    private TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesBasedOnYearlyIncome(double yearlyIncome) {
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}
