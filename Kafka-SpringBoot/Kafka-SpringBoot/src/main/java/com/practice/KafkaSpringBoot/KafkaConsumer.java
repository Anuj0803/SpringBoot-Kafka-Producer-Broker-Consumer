package com.practice.KafkaSpringBoot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "NewTopic" , groupId = "myGroup")
    public void consume(String message){
         System.out.println("Message Received "+message);
    }
}
