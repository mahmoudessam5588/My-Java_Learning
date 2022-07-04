package com.company.InterfacesExample;

public class DataBaseLoader implements DataLoader,DataRemover{
    @Override
    public void load() {
        System.out.println("loading data from database");

    }

    @Override
    public void remove() {
        System.out.println("Delete");
    }

    @Override
    public void checkPermission() {

        System.out.println("permission Granted from Database");
    }
}
