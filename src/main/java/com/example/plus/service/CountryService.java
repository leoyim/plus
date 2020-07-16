package com.example.plus.service;

import com.example.plus.dao.CountryMapper;
import com.example.plus.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryMapper countryMapper;

    public Country getCountry(String code){
        return countryMapper.getCountry(code);
    }

    public List<Country> country(){
        return countryMapper.country();
    }
}
