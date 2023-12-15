package com.Application.SportsResult.core.service;

import com.Application.SportsResult.core.api.mailsender.MailSender;
import com.Application.SportsResult.core.model.User;
import com.Application.SportsResult.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    private MailSender mailgunSender;
    @Autowired
    private MailSender sendgridSender;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(@PathVariable String id){
        return userRepository.findById(id);
    }

    public String sendEmailToAllUsers(String message){
        List<User> users = userRepository.findAll();
        return mailgunSender.send(users, message);
    }
}
