package com.javakafka.controller;

import com.javakafka.dto.Customer;
import com.javakafka.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisher;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publisherMessage(@PathVariable String message){
        try{
            for(int i=1; i<=10000; i++){
                publisher.sendMessageToTopic(message+" : "+i);
            }
            return  ResponseEntity.ok("message published successfully..");
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @PostMapping("/publish")
    public void sendEvents(@RequestBody Customer customer){
        publisher.sendEventsToTopic(customer);
    }
}
