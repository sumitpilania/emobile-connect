package com.hcl.hackathon.emobileconnect.models;

public class RequestDetails {

    int requestId;
    User user;
    RequestStatus status;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RequestDetails{" +
                "requestId=" + requestId +
                ", user=" + user +
                ", status=" + status +
                '}';
    }
}
