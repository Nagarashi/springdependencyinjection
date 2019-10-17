package com.switchfully.springdi;

import com.switchfully.springdi.configuration.TaxConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaxCalculatorService {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaxConfig.class);

        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);

        System.out.println(taxCalculator.calculateTaxesBasedOnYearlyIncome(23000));
    }

}
