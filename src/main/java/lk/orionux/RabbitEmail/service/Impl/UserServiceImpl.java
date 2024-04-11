package lk.orionux.RabbitEmail.service.Impl;

import lk.orionux.RabbitEmail.dto.EmailDetails;
import lk.orionux.RabbitEmail.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 4/2/2024
 * @project : RabbitEmail
 */

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange.email.name}")
    private String emailExchange;

    @Value("${rabbitmq.binding.email.name}")
    private String emailRoutingKey;
    @Override
    public void sentEmails(EmailDetails email) {

        rabbitTemplate.convertAndSend(emailExchange,
                emailRoutingKey,
                EmailDetails.builder()
                        .messageBody(email.getMessageBody())
                        .recipient(email.getRecipient())
                        .subject(email.getSubject())
                        .build());
    }
}
