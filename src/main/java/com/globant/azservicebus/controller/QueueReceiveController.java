package com.globant.azservicebus.controller;

import com.globant.azservicebus.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiveController {

    /*
    * Receive messages from a Service Bus queue
    * */

    private static final String QUEUE_NAME = "<ServiceBusQueueName>";

    private final Logger logger = LoggerFactory.getLogger(QueueReceiveController.class);

    /*@JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    public void receiveMessage(User user) {
        logger.info("Received message: {}", user);
    }*/

}
