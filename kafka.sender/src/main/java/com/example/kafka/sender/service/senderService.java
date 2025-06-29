package com.example.kafka.sender.service;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class senderService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendmessage(String message){
        kafkaTemplate.send("messaging","rakesh_to_user1",message);
    }

}
