package com.example.demo.SpringBoot__Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    private   CPU cpu ; 
    public Computer ( CPU cpu ) { 
        this.cpu = cpu ; 
    }
    public void start () { 
        cpu.run();
    }
}
