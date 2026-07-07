package com.example.demo.SpringBoot__Core.index01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationCilent {
    private final MessageService messageService ;
    @Autowired
    public NotificationCilent ( @Qualifier("emailService") MessageService messageService ) {
        this.messageService = messageService ;
    }
    public void send ( String not , String mess ) {
        this.messageService.sendMessage(not , mess );
    }
}
