package com.hcl.hackathon.emobileconnect.repo;

import com.hcl.hackathon.emobileconnect.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {



}
