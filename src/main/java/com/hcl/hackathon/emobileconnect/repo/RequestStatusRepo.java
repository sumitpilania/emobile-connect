package com.hcl.hackathon.emobileconnect.repo;

import com.hcl.hackathon.emobileconnect.entity.RequestStatusEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public abstract class RequestStatusRepo implements CrudRepository<RequestStatusEntity, Integer> {


    @Query("SELECT t FROM RequestStatusEntity t WHERE t.requestId = :requestId")
    public abstract RequestStatusEntity findByRequestId(@Param("requestId") Integer requestId );

    public abstract Object findAll(Pageable paging);
}
