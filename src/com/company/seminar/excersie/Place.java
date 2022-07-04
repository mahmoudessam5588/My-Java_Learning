package com.company.seminar.excersie;

public class Place {
    private String address;


    public void printAddress() {
        System.out.println(this.address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Place(String address) {
        this.address = address;
    }
    public String toString() {
        return this.address;
    }
}
