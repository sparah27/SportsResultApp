package com.Application.SportsResult.core.api.mailsender;

import com.Application.SportsResult.core.model.User;

import java.util.List;

public interface MailSender {
    public String send(List<User> users, String message);
}
