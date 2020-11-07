package com.hcl.hackathon.emobileconnect.dto;

import org.springframework.stereotype.Component;
@Component
public class RequestStatus {
    private int requestId;
    private int userId;
    public int getRequestId() {
        return requestId;
    }
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
    private String assignedNumber;
    private String status;
}
