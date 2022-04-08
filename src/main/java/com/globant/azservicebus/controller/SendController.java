package com.globant.azservicebus.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globant.azservicebus.model.RawEvent;
import com.globant.azservicebus.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SendController {

    private static final String TOPIC_NAME = "users";

    private static final Logger logger = LoggerFactory.getLogger(SendController.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/messages")
    public String postMessage(@RequestParam String message) {
        logger.info("Sending message");

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonObj = "";
        try{
            jsonObj = objectMapper.writeValueAsString(new User(message));
        } catch(IOException e){
            e.printStackTrace();
        }
        //jmsTemplate.convertAndSend(TOPIC_NAME, jsonObj);
        jmsTemplate.convertAndSend(TOPIC_NAME, RawEvent.builder().message("Sending test message: " + message).build());
        return message;
    }

}
