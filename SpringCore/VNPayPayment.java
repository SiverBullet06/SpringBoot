package com.example.demo.SpringBoot__Core.Payment;

import org.springframework.stereotype.Component;

@Component
public class VNPayPayment implements I_Banking {
    public void Banking () { 
        System.out.println("VNPay is banking ...............");
    }
}
