package com.kk.kk.consumer.service;

import com.kk.kk.consumer.model.TransactionMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);
    @KafkaListener(topics = {"transaction-topic"}, groupId = "group-id")
    public void  consume(TransactionMessage transactionMessage){
        log.info("we are receive the transaction " + transactionMessage.getTransactionId()
        +" The status is " + transactionMessage.getStatus());
    }
}

