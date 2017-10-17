package com.bestpay.cup.controller;

import com.bestpay.cup.mapper.CityMapper;
import com.bestpay.cup.model.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Resource
    private CityMapper cityMapper;
    @RequestMapping(value = "getUsername")
    public String getUsername(String callback){
        return "admin";
    }
    @RequestMapping(value = "user/{id}")
    public CityModel findByID(@PathVariable int id){
       return cityMapper.selectByCityId(id);
    }
    @RequestMapping(value = "user")
    public List<CityModel> findAll(){
        return cityMapper.selectAll();
    }
}
