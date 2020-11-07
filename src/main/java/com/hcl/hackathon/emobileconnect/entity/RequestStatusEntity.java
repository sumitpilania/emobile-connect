package com.hcl.hackathon.emobileconnect.entity;



import javax.persistence.*;



import org.springframework.data.jpa.domain.support.AuditingEntityListener;




@Entity
@Table(name = "requestUserMapping")
@EntityListeners(AuditingEntityListener.class)
public class RequestStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "requestId", updatable = false, nullable = false)
    private int requestId;



    @Column(name = "userid")
    int userId;
    @Column
    String assignedNumber;
    @Column
    String status;



    public RequestStatusEntity() {
    }



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



    @Override
    public String toString() {
        return "RequestStatus{" + "requestId=" + requestId + ", userId=" + userId + ", assignedNumber='"
                + assignedNumber + '\'' + ", status='" + status + '\'' + '}';
    }
}