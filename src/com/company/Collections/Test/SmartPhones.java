package com.company.Collections.Test;

import java.util.Objects;

public class SmartPhones {
    private String serialNumber;
    private String name;


    @Override
    public boolean equals(Object o) {
        if(o==null)return false;
        if (this == o) return true;
        if (this.getClass()!=o.getClass()) return false;
        SmartPhones smartPhones = (SmartPhones)o;
        return serialNumber!=null&&serialNumber.equals(smartPhones.serialNumber);
    }
    //if x.equals(y) = true => y.hashcode()==x.hashcode()
    //if y.hashcode()==x.hashcode() =>doesn't mean y.equals(x) = true or vise versa
    //y.hashcode()!=x.hashcode() =>x.equals() should be false

    @Override
    public String toString() {
        return "SmartPhones{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return serialNumber==null ? 0 : serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SmartPhones(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }
}
