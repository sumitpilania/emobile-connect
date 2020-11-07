package com.hcl.hackathon.emobileconnect.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "requestUserMapping")
@EntityListeners(AuditingEntityListener.class)
public class RequestStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "requestId", updatable = false, nullable = false)
    private Integer requestId;


    @Column(name = "userid")
    Integer userId;

    @Column
    String assignedNumber;

    @Column
    String status;

    public RequestStatusEntity() {
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAssignedNumber() {
        return assignedNumber;
    }

    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RequestStatus{" +
                "requestId=" + requestId +
                ", userId=" + userId +
                ", assignedNumber='" + assignedNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
