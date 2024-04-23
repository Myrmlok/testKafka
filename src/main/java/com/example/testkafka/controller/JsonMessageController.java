package com.example.testkafka.controller;

import com.example.testkafka.config.kafka.JSONKafkaProducer;
import com.example.testkafka.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/jsonKafka")
@RequiredArgsConstructor
public class JsonMessageController {
    private final JSONKafkaProducer producer;
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        producer.sendMessage(user);
        return ResponseEntity.ok("JSon Message send");
    }
}
