package com.jct.controller;

import com.jct.bean.Country;
import com.jct.service.ICountryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="yes")
public class HelloController {

    @Autowired
    ICountryservice iCountryservice;

    @RequestMapping(value="t")
    public List<Country> test(){
        System.out.println("coming!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        List<Country> countryList =iCountryservice.selectAll();
        for (Country country : countryList) {
            System.out.println(country.getCountryName());
        }


        return countryList;
    }
}
