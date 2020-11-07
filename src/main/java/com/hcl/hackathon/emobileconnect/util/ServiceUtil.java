package com.hcl.hackathon.emobileconnect.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.hcl.hackathon.emobileconnect.entity.UserEntity;
import com.hcl.hackathon.emobileconnect.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceUtil {

    @Autowired
    private JsonMapper mapper;

    public User convertToDto(UserEntity entity) {
        User userDto = mapper.convertValue(entity, User.class);
        return userDto;
    }


}
