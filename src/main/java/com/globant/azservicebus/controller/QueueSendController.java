package com.globant.azservicebus.controller;

import com.globant.azservicebus.model.RawEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class QueueSendController {

    private static final String QUEUE_NAME = "<QUEUE_NAME>";

    private static final Logger LOGGER = LoggerFactory.getLogger(QueueSendController.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/queue")
    public String postMessage(@RequestParam String message) {

        LOGGER.info("Sending message");
        jmsTemplate.convertAndSend(QUEUE_NAME,
                RawEvent.builder()
                        .message("Testing: " + message)
                        .build());
        return message;
    }

}
