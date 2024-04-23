package com.example.testkafka.config.kafka;

import com.example.testkafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static  final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "topic2",groupId = "group1")
    public void consume(User message){
        LOGGER.info(String.format("Message received "+message.toString()));
    }
}
