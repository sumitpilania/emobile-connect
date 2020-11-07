package com.hcl.hackathon.emobileconnect.controller;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.hcl.hackathon.emobileconnect.dto.RequestStatus;
import com.hcl.hackathon.emobileconnect.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(path = "/admin/v1")
public class Admin {
    @Autowired
    private RequestService service;
    @Autowired
    private JsonMapper mapper;
    @GetMapping(path = "/allnewconnections",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RequestStatus>> getAllNewMobileRequest(
            @RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "10") int size)
    {
        Pageable paging = PageRequest.of(page, size);
        List<RequestStatus> requestStatus = service.getAllNewMobileRequest(paging);
        return new ResponseEntity<>(requestStatus, HttpStatus.OK);
    }
    @GetMapping(path = "/getByRequestId{requestId}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequestStatus> getByRequestId(@PathVariable Integer requestId)
    {
        RequestStatus user = service.getByRequestId(requestId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
