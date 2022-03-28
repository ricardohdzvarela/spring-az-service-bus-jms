package com.globant.azservicebus.controller;

import com.globant.azservicebus.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiveController {

    /*
    * Receive messages from a Service Bus subscription
    * */

    private static final String TOPIC_NAME = "<ServiceBusTopicName>";

    private static final String SUBSCRIPTION_NAME = "<ServiceBusSubscriptionName>";

    private final Logger logger = LoggerFactory.getLogger(TopicReceiveController.class);

    /*@JmsListener(destination = TOPIC_NAME, containerFactory = "topicJmsListenerContainerFactory",
            subscription = SUBSCRIPTION_NAME)
    public void receiveMessage(User user) {
        logger.info("Received message: {}", user.getName());
    }*/

}
