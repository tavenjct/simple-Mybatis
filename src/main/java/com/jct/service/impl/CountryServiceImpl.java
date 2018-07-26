package com.jct.service.impl;

import com.jct.bean.Country;
import com.jct.dao.CountryDao;
import com.jct.service.ICountryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryservice {

    @Autowired
    private CountryDao asd;

    @Override
    public List<Country> selectAll() {
        return asd.selectAll();
    }
}
