package com.example.demo.SpringBoot__Core.Payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MomoPayment implements I_Banking  {
    public void Banking () { 
        System.out.println(" Momo is banking ........");
    }
    
}
