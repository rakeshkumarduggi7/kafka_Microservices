package com.example.kafka.reciever;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class service {

@KafkaListener(topics = "messaging",groupId = "receiver-group")
    public void readmessages(String m){
    System.out.println(m);
}
}
