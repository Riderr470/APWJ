package com.domain;


public class Tax_detail {
    private int id;
    private int taxable_income_year;
    private double tax;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getTaxable_income_year(){return taxable_income_year;}
    public void setTaxable_income_year(int taxable_income_year) {
        this.taxable_income_year = taxable_income_year;
    }


    public double getTax(){return tax;}
    public void setTax(double tax) {
        this.tax = tax;
    }


}
