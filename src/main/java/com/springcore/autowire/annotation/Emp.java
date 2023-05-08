package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    @Autowired
    @Qualifier("tempaddress2")
    private Address address;

    public Address getAddress() {
        return address;
    }
//    @Autowired
    public void setAddress(Address address) {
        System.out.println("setting value...");
        this.address = address;
    }

    public Emp(){
        super();
    }

//    @Autowired
    public Emp(Address address) {
        System.out.println("inside constructor...");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
