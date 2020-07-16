package com.example.plus.dao;

import com.example.plus.entity.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryMapper {
    List<Country> country();
    Country getCountry(String code);
}
