package com.hcl.hackathon.emobileconnect.dao;

import com.hcl.hackathon.emobileconnect.entity.RequestStatusEntity;
import com.hcl.hackathon.emobileconnect.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<RequestStatusEntity, Integer>{
}