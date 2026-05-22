package com.example.demo.SpringBoot__Core.Payment;

import java.lang.ProcessHandle.Info;

import org.springframework.stereotype.Component;

@Component
public class PaypalPayment implements I_Banking {
    public void Banking () { 
        System.out.println(" PayPal is banking .........");
    }
}
