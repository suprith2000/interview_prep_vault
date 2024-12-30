package com.javakafka.consumer;


import com.javakafka.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "javaTechie-demo2",groupId = "jt-group")
    public void consume1(Customer customer){
        log.info("consumer consume the events {} ",customer.toString());

    }



//    @KafkaListener(topics = "javaTechie-demo-1",groupId = "jt-group")
//    public void consume2(String message){
//        log.info("consumer2 consume the message {} ",message);
//
//    }
//
//    @KafkaListener(topics = "javaTechie-demo-1",groupId = "jt-group")
//    public void consume3(String message){
//        log.info("consumer3 consume the message {} ",message);
//
//    }
//
//    @KafkaListener(topics = "javaTechie-demo-1",groupId = "jt-group")
//    public void consume4(String message){
//        log.info("consumer4 consume the message {} ",message);
//
//    }
}
