package com.example.demo.kafka;

import com.example.demo.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {

    @KafkaListener(topics = "demo-topic", groupId = "group_id")
    public void consume(User user) {
        System.out.println("Received user: " + user.getName() + ", Age: " + user.getAge());
    }
}

