package com.company.OopInDepth;


record Address(String street, int zipcode) {

    String getStreet() {
        return street;
    }


    int getZipcode() {
        return zipcode;
    }


}
