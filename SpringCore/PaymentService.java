package com.example.demo.SpringBoot__Core.Payment;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
 public class  PaymentService {
    //Map co san 
    /* 
    private final Map < String  , I_Banking > ibanking ;
    public PaymentService ( Map < String  , I_Banking > ibanking ) { 
        this.ibanking = ibanking ; 
    }
        */

    //// build map thu cong 
    
    private final Map <Integer , I_Banking > banks = new HashMap <>() ; 

    public PaymentService ( MomoPayment momo ,PaypalPayment paypal , VNPayPayment vnpay) { 
        banks.put(1, momo) ; 
        banks.put(2,paypal) ; 
        banks.put(3, vnpay) ; 
    }
    public void Maintenance () { 
        System.out.println("System maintenance.........");
    }
    public void online (int choose ) { 
        System.out.println("Banking system running...\n");
        I_Banking bank  = banks.get(choose) ; 
        if ( choose >=1 && choose <=3) { 
            bank.Banking();
        } else { 
            System.out.println("Invalid bank!");
        }
    }

}
