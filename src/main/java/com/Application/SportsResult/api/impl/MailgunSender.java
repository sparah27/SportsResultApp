package com.Application.SportsResult.api.impl;

import com.Application.SportsResult.core.api.mailsender.MailSender;
import com.Application.SportsResult.core.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MailgunSender implements MailSender {
    @Override
    public String send(List<User> users, String message) {
        for (User user : users) {
            System.out.println("Message sent to: " + user.getEmail());
        }
        return "Message: " + message + "Sent via Mailgun.";
    }
}
