package com.example.testkafka.config.kafka;

import com.example.testkafka.dto.User;
import lombok.AllArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaConsumer {
    private static  final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "topic2",groupId = "group1")
    public void consume(String message){
        LOGGER.info(String.format("Message received "+message));
    }
}
