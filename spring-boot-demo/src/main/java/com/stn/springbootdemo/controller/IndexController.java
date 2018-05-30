package com.stn.springbootdemo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stn.springbootdemo.dao.UserRep;
import com.stn.springbootdemo.model.User;
import com.stn.springbootdemo.wrapper.WrapperPage;
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
    public WrapperPage getPage(@RequestParam(defaultValue="nobody") String name,
                        Integer pageNum, Integer pageSize){
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        System.out.println("debug ===="+pageNum);
        List<User> list=userRep.findAll();
        System.out.println("debug ====find");
        PageInfo pageInfo = new PageInfo(list);
        System.out.println("debug ====pageInfo");
        return WrapperPage.ok(pageInfo);
    }

    @RequestMapping(value = {"/config"},method = {RequestMethod.GET,RequestMethod.POST})
    public String config(){
        return "page: "+page+" size: "+size+" application_name: "+application_name;
    }




}
