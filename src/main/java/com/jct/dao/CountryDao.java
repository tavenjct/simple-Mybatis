package com.jct.dao;

import com.jct.bean.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("asd")
public interface CountryDao {

    List<Country> selectAll();
}
