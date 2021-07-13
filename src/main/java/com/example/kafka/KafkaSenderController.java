package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSenderController {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @PostMapping(path = "/send/message/{content}")
    public void sendFoo(@PathVariable String content) {
        this.template.send("topic1", new SampleMessage(content));
    }
}
