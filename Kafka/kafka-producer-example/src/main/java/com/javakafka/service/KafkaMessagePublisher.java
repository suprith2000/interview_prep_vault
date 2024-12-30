package com.javakafka.service;

import com.javakafka.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String,Object>  template;

    public void sendMessageToTopic(String message){
        CompletableFuture<SendResult<String, Object>> future = template.send("javaTechie-demo-1",message);
        future.whenComplete((result,ex)->{
            if (ex == null){
                System.out.println("sent message=["+ message +
                        "] with offset=[" + result.getRecordMetadata().offset()+"]");
            } else {
                System.out.println("unable to send message=[" +
                        message + "] due to : " + ex.getMessage());
            }
        });
    }

    public void sendEventsToTopic(Customer customer){
        try{
            CompletableFuture<SendResult<String, Object>> future = template.send("javaTechie-demo2",customer);
            future.whenComplete((result,ex)->{
                if (ex == null){
                    System.out.println("sent message=["+ customer.toString() +
                            "] with offset=[" + result.getRecordMetadata().offset()+"]");
                } else {
                    System.out.println("unable to send message=[" +
                            customer.toString() + "] due to : " + ex.getMessage());
                }
            });
        } catch (Exception exception){
            System.out.println("ERROR : "+ exception.getMessage());
        }

    }

}
