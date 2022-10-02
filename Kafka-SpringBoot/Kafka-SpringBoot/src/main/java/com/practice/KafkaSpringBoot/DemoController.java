package com.practice.KafkaSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;


    // Publish messages using the GetMapping
    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message")
                                 final String message){
        kafkaTemplate.send("NewTopic", message);
        return "Published Successfully";
    }

    @PostMapping("/publish/data")
    public ResponseEntity<String> publishUserData(@RequestBody User user){
        kafkaTemplate.send("NewTopic", user.toString());
        System.out.println(user);
        return ResponseEntity.ok("User data Published " +user);
    }
}
