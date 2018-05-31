package com.stn.springbootdemo.controller;

import com.stn.springbootdemo.dao.UserRep;
import com.stn.springbootdemo.service.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@PropertySource(value = "classpath:test.yml")
@RestController
public class RedisController {


    @Autowired
    private UserRep userRep;

    @Autowired
    RedisClient redisClient;


    @RequestMapping(value = {"/redis/set"},method = {RequestMethod.GET,RequestMethod.POST})
    public String set(@RequestParam(defaultValue="test") String key,
                        @RequestParam(defaultValue="hello world") String value,
                        @RequestParam(defaultValue="10") long second){
        if(key==null||"".equals(key))return "please input key thks";
        if(value==null||"".equals(value))return "please input value thks";
        this.redisClient.getTemplate().opsForValue().set(key,value,second, TimeUnit.SECONDS);
        return "set===key: "+key+"<br/>value: "+value+"<br/>second: "+second;
    }

    @RequestMapping(value = {"/redis/get"},method = {RequestMethod.GET,RequestMethod.POST})
    public String get(@RequestParam(defaultValue="test") String key){
        return this.redisClient.getTemplate().opsForValue().get(key);
    }







}
