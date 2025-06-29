package com.example.kafka.sender;
import com.example.kafka.sender.service.senderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Scanner;
@SpringBootApplication
public class consoleSend {
    public static void main(String[] args){
        ApplicationContext context= SpringApplication.run(consoleSend.class);
        senderService service=context.getBean(senderService.class);
        Scanner sc=new Scanner(System.in);
       while (true){
           System.out.print("enter message ");
           String  m= sc.nextLine();
           if (m.equals("exit")){
               break;
           }else{
            service.sendmessage(m);
           }
       }
    }

}
