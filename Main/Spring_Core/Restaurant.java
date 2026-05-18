package com.example.demo.SpringBoot__Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    @Autowired
    private final  Chef chef ; 
    public Restaurant ( Chef chef ) { 
        this.chef = chef ; 
    }
    public void open () { 
        System.out.println("Restaurant opened !\n");
        chef.cook();
    }


}
