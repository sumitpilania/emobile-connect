package com.hcl.hackathon.emobileconnect.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.hcl.hackathon.emobileconnect.entity.RequestStatusEntity;
import com.hcl.hackathon.emobileconnect.dto.RequestStatus;
import com.hcl.hackathon.emobileconnect.repo.RequestStatusRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@Slf4j
public class RequestService {

    @Autowired
    private RequestStatusRepo repo;

    @Autowired
    private JsonMapper mapper;


    public List<RequestStatus> getAllNewMobileRequest(Pageable paging) {


        log.info("pageNumber "+paging.getPageNumber());
        log.info("pageSize "+paging.getPageSize());

        List<RequestStatusEntity> requestStatusEntity = (List<RequestStatusEntity>) repo.findAll(paging);
        List<RequestStatus> statusList = new ArrayList<>();
        for (RequestStatusEntity reqEntity : requestStatusEntity) {
           RequestStatus dto =  convertToDto(reqEntity);
            statusList.add(dto);
        }
        log.info("statusList "+statusList);


         return statusList;
    }

    public RequestStatus getByRequestId(Integer requestId) {
        RequestStatusEntity req;
        req = repo.findByRequestId(requestId);
         RequestStatus dto =  convertToDto(req);
        log.info("statusList "+dto);
         return dto;
    }


    public RequestStatus convertToDto(RequestStatusEntity entity) {
        RequestStatus Dto = mapper.convertValue(entity, RequestStatus.class);
        return Dto;
    }
}
