package com.company.Collections.Test;


import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class CustomerMapTest1 {
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CustomerMapTest1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerMapTest1 that = (CustomerMapTest1) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public CustomerMapTest1(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,100000);
        this.name = name;
    }


}
