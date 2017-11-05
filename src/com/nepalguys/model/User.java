package com.nepalguys.model;

public class User {
    private Name name;
    private String userId;
    private Address address;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", userId='" + userId + '\'' +
                ", address=" + address +
                '}';
    }
}
