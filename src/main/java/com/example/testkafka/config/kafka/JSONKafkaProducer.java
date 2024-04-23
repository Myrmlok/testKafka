package com.example.testkafka.config.kafka;

import com.example.testkafka.dto.User;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JSONKafkaProducer {
    private static  final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String, User> kafkaTemplate;
    public void sendMessage(User user){
        LOGGER.info(String.format("message sent "+user.toString()));
        Message<User> message= MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC,"topic2").build();
        kafkaTemplate.send(message);
    }
}
