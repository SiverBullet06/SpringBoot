package com.example.demo.SpringBoot__Core.index01;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService {
    @Override
    public void  sendMessage (String notice , String message ) {
        System.out.println("Thong bao can chu y :"+notice+"\n Noi dung :"+message);
    }
}
