package com.example.demo.SpringBoot__Core.index01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainApp {
    public static void main(String[] args) {

        // 1. Khởi tạo Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class) ;

        // 2. Lấy đối tượng NotificationController ra từ Context (Không cần tự new)
//        NotificationController controller = context.getBean(NotificationController.class);
        NotificationCilent cilent = context.getBean( NotificationCilent.class ) ;

        // 3. Sử dụng
        cilent.send("khachhang@gmail.com", "Đơn hàng của bạn đã được giao!");
    }
}
