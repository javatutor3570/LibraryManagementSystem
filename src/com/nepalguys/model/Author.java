package com.nepalguys.model;

public class Author {
    private Name name;
    private Address address;
    private String designation;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name=" + name +
                ", address=" + address +
                ", designation='" + designation + '\'' +
                '}';
    }
}
