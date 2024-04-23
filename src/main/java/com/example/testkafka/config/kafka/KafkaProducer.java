package com.example.testkafka.config.kafka;

import lombok.AllArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaProducer {
    private static  final Logger LOGGER=LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String,String> kafkaTemplate;
    public void sendMessage(String message){
        LOGGER.info(String.format("message sent $s",message));
        kafkaTemplate.send("topic2",message);
    }
}
