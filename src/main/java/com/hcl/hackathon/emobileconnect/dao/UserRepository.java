package com.hcl.hackathon.emobileconnect.dao;

import com.hcl.hackathon.emobileconnect.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
