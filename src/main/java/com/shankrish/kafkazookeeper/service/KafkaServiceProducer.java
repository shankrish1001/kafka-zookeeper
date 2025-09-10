package com.shankrish.kafkazookeeper.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaServiceProducer {
    private static final Logger logger = Logger.getLogger(KafkaServiceProducer.class.getName());
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaServiceProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        logger.info("Kafka Producer sendMessage:"+message);
        kafkaTemplate.send("kafka-topic-11", message);
    }
}

