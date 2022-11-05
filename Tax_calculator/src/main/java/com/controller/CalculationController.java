package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {

    @RequestMapping("/taxable")
    public String tax(@RequestParam("category")String category,
                      @RequestParam("salary")int salary,
                      @RequestParam("rent")int rent,
                      @RequestParam("allow")int allow,
                      @RequestParam("conv")int conveyence,
                      @RequestParam("bonus") int bonus,
                      Model model) {
        int t = salary*10/100;
        int salary_year = salary*12;
        int rent_year = rent*12;
        int conv_year = conveyence*12;
        int med_allow_year = allow*12;
        int bonus_year = bonus*2;
        int tax_liab_range = 300000;
        int taxable_income = salary_year;
        double tax =0;
        if ((salary_year/2) < 300000){
            taxable_income = taxable_income + (rent_year-(salary_year/2));
        }
        else{
            taxable_income = taxable_income + (rent_year - 300000);
        }
        if (conveyence>2500){
            taxable_income = taxable_income + (conv_year-30000);
        }


        if(med_allow_year > 120000){
            taxable_income = taxable_income + (120000-(t*12));
        }
        else{
            taxable_income = taxable_income + (med_allow_year-(t*12));
        }

        taxable_income = taxable_income + bonus_year;
        model.addAttribute("max", taxable_income);

        if (category.equals("Female/Senior citizen")) {
            tax_liab_range = 350000;
        } else if (category.equals("Disabled")) {
            tax_liab_range = 450000;
        }
        else if (category.equals("Gazetted freedom fighter")){
            tax_liab_range = 475000;
        }

        if (taxable_income > tax_liab_range){
                taxable_income = taxable_income - tax_liab_range;

                if(taxable_income > 100000){
                    tax = (int)(100000 * 0.05); // for first 1lakh tax rate 5%
                    taxable_income = taxable_income - 100000;
                    if (taxable_income > 300000){
                        tax = tax + (int)(300000 * 0.1); // 2nd 3lakh tax rate 10%
                        taxable_income = taxable_income - 300000;
                        if (taxable_income > 400000){
                            tax = tax + (int)(400000 * 0.15); // 3rd 4lakh tax rate 15%
                            taxable_income = taxable_income - 400000;

                            if (taxable_income > 500000){
                                tax = tax + (int)(500000 * 0.20); // 4th 5lakh tax rate 20%
                                taxable_income = taxable_income - 500000;

                                if(taxable_income > 0){
                                    tax = tax + (int) (taxable_income * 0.25); // rest are 25%
                                }
                            }
                            else {
                                tax = tax + (int)(taxable_income * 0.20);
                            }
                        }
                        else {
                            tax = tax + (int)(taxable_income * 0.15);
                        }
                    }
                    else{
                        tax = tax + (int)(taxable_income * 0.1);
                    }
                }
                else{
                    tax = (int)(taxable_income * (0.05));
                }
            }
            else{

            }

        model.addAttribute("total", tax);

        tax = tax/12;
        //model.addAttribute("sal", kal);
        model.addAttribute("tax", tax);
        model.addAttribute("taxable", taxable_income);
        return "tax";
    }

}
