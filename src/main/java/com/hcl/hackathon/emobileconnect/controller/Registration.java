package com.hcl.hackathon.emobileconnect.controller;

import com.hcl.hackathon.emobileconnect.dao.UserRepository;
import com.hcl.hackathon.emobileconnect.entity.UserEntity;
import com.hcl.hackathon.emobileconnect.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Registration {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/newrequest")
    public void newConnection(@RequestBody User user){

        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("TestName");
        userRepository.save(userEntity);
    }

}
