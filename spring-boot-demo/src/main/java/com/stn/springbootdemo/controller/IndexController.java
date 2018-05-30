package com.stn.springbootdemo.controller;

import com.stn.springbootdemo.dao.UserRep;
import com.stn.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@PropertySource(value = "classpath:test.yml")
@RestController
public class IndexController {
    @Value("${page}")
    private Integer page;
    @Value("${size}")
    private Integer size;
    @Value("${application_name}")
    private String application_name;

    @Autowired
    private UserRep userRep;

    @RequestMapping(value = {"/","/index"},method = {RequestMethod.GET,RequestMethod.POST})
    public String index(@RequestParam(defaultValue="stn") String name){
        return name+" say hello world!!!!";
    }

    @RequestMapping(value = {"/add"},method = {RequestMethod.GET,RequestMethod.POST})
    public String add(@RequestParam(defaultValue="somebody") String name,
                        @RequestParam(defaultValue="female") String sex,
                        @RequestParam(defaultValue="china") String address){
        User user=new User();
        user.setName(name);
        user.setSex(sex);
        user.setAddress(address);
        userRep.save(user);
        return name+" say hello world!!!!";
    }

    @RequestMapping(value = {"/info"},method = {RequestMethod.GET,RequestMethod.POST})
    public User info(@RequestParam(defaultValue="nobody") String name){
        return userRep.findByName(name);
    }

    @RequestMapping(value = {"/update"},method = {RequestMethod.GET,RequestMethod.POST})
    public User update(@RequestParam(defaultValue="somebody") String name,
                       @RequestParam(defaultValue="female") String sex,
                       @RequestParam(defaultValue="china") String address,
                       @RequestParam(defaultValue="json_testfdsfd") String json_test
                       ){
        User exist=userRep.findByName(name);
        User user=new User();
        user.setId(exist.getId());
        user.setName(name);
        user.setSex(sex);
        user.setAddress(address);
        user.setJsonTest(json_test);
        userRep.save(user);
        return userRep.findByName(name);
    }

    @RequestMapping(value = {"/del"},method = {RequestMethod.GET,RequestMethod.POST})
    public User del(@RequestParam(defaultValue="nobody") String name){
        User exist=userRep.findByName(name);
        userRep.deleteById(exist.getId());
        return exist;
    }

    @RequestMapping(value = {"/getList"},method = {RequestMethod.GET,RequestMethod.POST})
    public List<User> getList(@RequestParam(defaultValue="nobody") String name){
        return userRep.findAll();
    }

    @RequestMapping(value = {"/getPage"},method = {RequestMethod.GET,RequestMethod.POST})
    public List<User> getPage(@RequestParam(defaultValue="nobody") String name){
        return userRep.findAllByName(name);
    }

    @RequestMapping(value = {"/config"},method = {RequestMethod.GET,RequestMethod.POST})
    public String config(){
        return "page: "+page+" size: "+size+" application_name: "+application_name;
    }




}
