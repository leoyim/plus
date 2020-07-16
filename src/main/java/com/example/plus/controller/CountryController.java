package com.example.plus.controller;

import com.example.plus.entity.Country;
import com.example.plus.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * The type Country controller.
 */
@RestController
@RequestMapping("world")
public class CountryController {
    @Autowired
    private CountryService countryService;
    //获取country列表
    @RequestMapping("country")
    public List<Country> country(HttpServletResponse response){
        List<Country> countryList = countryService.country();
        System.out.println(countryList);
        //解决浏览器跨域请求问题
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        return countryList;
    }
    //根据Country Code获取Country信息
    @RequestMapping("getCountry/{code}")
    public String getCountry(@PathVariable("code") String code) {
        return countryService.getCountry(code).toString();
    }
}