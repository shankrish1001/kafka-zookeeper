package com.shankrish.kafkazookeeper.controller;

import com.shankrish.kafkazookeeper.service.KafkaServiceProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaSendController {
    private final KafkaServiceProducer producer;

    public KafkaSendController(KafkaServiceProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendText(@RequestParam String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent");
    }

}

