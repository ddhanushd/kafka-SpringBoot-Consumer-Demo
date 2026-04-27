package com.kafka.kafkaconsumerexample.service;

import com.kafka.kafkaconsumerexample.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "KafkaTopic-demo",groupId = "group-new")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

//    @KafkaListener(topics = "KafkaTopic-demo-2", groupId = "group-new")
//    public void consumer2(String message) {
//        log.info("consumer2 consume the message {} ", message);
//    }
//    @KafkaListener(topics = "KafkaTopic-demo-2", groupId = "group-new")
//    public void consumer3(String message) {
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "KafkaTopic-demo-2", groupId = "group-new")
//    public void consumer4(String message) {
//        log.info("consumer4 consume the message {} ", message);
//    }
}
