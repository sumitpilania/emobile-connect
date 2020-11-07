package com.hcl.hackathon.emobileconnect.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {

    @Id
    int id;

    @Column
    String name;

    @Column(name = "existing_no")
    String existingNo;

    @Column(name = "e-mail")
    String email;

    @Column
    int age;

    @Column
    String adhaar;

    @Column
    String address;

    @Column
    String assignedNumber;

    @Column
    String requestId;

    public UserEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExistingNo() {
        return existingNo;
    }

    public void setExistingNo(String existingNo) {
        this.existingNo = existingNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(String adhaar) {
        this.adhaar = adhaar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAssignedNumber() {
        return assignedNumber;
    }

    public void setAssignedNumber(String assignedNumber) {
        this.assignedNumber = assignedNumber;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", existingNo='" + existingNo + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", adhaar='" + adhaar + '\'' +
                ", address='" + address + '\'' +
                ", assignedNumber='" + assignedNumber + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
