package com.hcl.hackathon.emobileconnect.controller;

import com.hcl.hackathon.emobileconnect.dao.RequestRepository;
import com.hcl.hackathon.emobileconnect.dao.UserRepository;
import com.hcl.hackathon.emobileconnect.entity.RequestStatusEntity;
import com.hcl.hackathon.emobileconnect.entity.UserEntity;
import com.hcl.hackathon.emobileconnect.dto.RequestDetails;
import com.hcl.hackathon.emobileconnect.dto.RequestStatus;
import com.hcl.hackathon.emobileconnect.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/emobileconnect")
public class Registration {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RequestRepository requestRepository;

    private static Logger logger = LoggerFactory.getLogger(Registration.class);

    @PostMapping("/newrequest")
    @Transactional
    public ResponseEntity<RequestDetails> newConnection(@RequestBody User user){

        UserEntity userEntity = new UserEntity();
        userEntity.setName(user.getName());
        userEntity.setAddress(user.getAddress());
        userEntity.setExistingno(user.getExistingNo());
        userEntity.setEmail(user.getEmail());
        userEntity.setAge(user.getAge());
        userEntity.setAdhaar(user.getAdhaar());
        UserEntity savedUser = userRepository.save(userEntity);

        RequestStatusEntity requestStatusEntity = new RequestStatusEntity();
        requestStatusEntity.setUserId(savedUser.getId());
        requestStatusEntity.setStatus(RequestStatus.InProgress.name());
        RequestStatusEntity savedRequest = requestRepository.save(requestStatusEntity);

        logger.info(savedRequest.toString());

        RequestDetails requestDetails = new RequestDetails();
        requestDetails.setRequestId(savedRequest.getRequestId());
        requestDetails.setStatus(RequestStatus.valueOf(savedRequest.getStatus()));
        ResponseEntity<RequestDetails> responseArticleResponseEntity = new ResponseEntity<RequestDetails>(requestDetails, HttpStatus.CREATED);
        return responseArticleResponseEntity;
    }

    @GetMapping("/trackrequest/{requestId}")
    @Transactional
    public ResponseEntity<RequestDetails> trackRequest(@PathVariable("requestId") Integer requestId){
        logger.info("request for request Id : "+requestId);
        int id = Integer.valueOf(requestId);
        boolean exists = requestRepository.existsById(id);
        if(exists){
            Optional<RequestStatusEntity> userEntityOptional = requestRepository.findById(id);
            if(userEntityOptional.isPresent()){
                RequestStatusEntity requestStatus = userEntityOptional.get();
                logger.info(requestStatus.toString());

                Optional<UserEntity> userById = userRepository.findById(requestStatus.getUserId());
                UserEntity userEntity1 = userById.get();
                logger.info(userEntity1.toString());
                User user = new User();
                user.setAddress(userEntity1.getAddress());
                user.setAdhaar(userEntity1.getAdhaar());
                user.setEmail(userEntity1.getEmail());
                user.setExistingNo(userEntity1.getExistingno());

                RequestDetails requestDetails = new RequestDetails();
                requestDetails.setStatus(RequestStatus.valueOf(requestStatus.getStatus()));
                requestDetails.setUser(user);
                ResponseEntity<RequestDetails> responseArticleResponseEntity = new ResponseEntity<RequestDetails>(requestDetails, HttpStatus.CREATED);
                return responseArticleResponseEntity;
            }else{
                ResponseEntity<RequestDetails> responseArticleResponseEntity = new ResponseEntity<RequestDetails>(HttpStatus.NOT_FOUND);
                return responseArticleResponseEntity;
            }
        }else{
            ResponseEntity<RequestDetails> responseArticleResponseEntity = new ResponseEntity<RequestDetails>(HttpStatus.NOT_FOUND);
            return responseArticleResponseEntity;
        }
    }
}
