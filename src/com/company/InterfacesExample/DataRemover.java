package com.company.InterfacesExample;

public interface DataRemover {
    int data=0;
    void remove();
    default void checkPermission(){
        System.out.println("checking Permission General");
    };
    static void restrictiveData(){};
}
