package com.example.demo.SpringBoot__Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.SpringBoot__Core.Engine;
@Component
public class Car {
        @Autowired
        private Engine engine ; 
        public void start () { 
            engine.run();
        }
}

