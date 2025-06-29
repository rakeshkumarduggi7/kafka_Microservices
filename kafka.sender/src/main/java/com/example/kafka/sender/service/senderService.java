package com.example.kafka.sender.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class senderService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendmessage(String message){
        kafkaTemplate.send("messaging","r_to_u1",message);
    }

}
