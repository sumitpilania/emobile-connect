package com.hcl.hackathon.emobileconnect.dto;

public class User {
    private String name;
    private String existingNo;
    private int age;
    private String adhaar;
    private String address;
    private String email;



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", existingNo='" + existingNo + '\'' +
                ", age=" + age +
                ", adhaar='" + adhaar + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
