package com.shankrish.kafkazookeeper.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaServiceConsumer {
    private static final Logger logger = Logger.getLogger(KafkaServiceConsumer.class.getName());

    @KafkaListener(topics = "kafka-topic-11", groupId = "kafka-group-11")
    public void consume(String message) {
        logger.info("Kafka Consumer Received:"+message);
    }

}

