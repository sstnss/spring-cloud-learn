package com.stn.springbootdemo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.alibaba.fastjson.annotation.JSONField;


@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String sex;
    private String address;

    public String getJsonTest() {
        return jsonTest;
    }

    public void setJsonTest(String jsonTest) {
        this.jsonTest = jsonTest;
    }

    //@JSONField(name="json_test")
    private String jsonTest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
