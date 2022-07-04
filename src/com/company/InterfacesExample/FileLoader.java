package com.company.InterfacesExample;

public class FileLoader implements DataLoader,DataRemover{
    @Override
    public void load() {
        System.out.println("loading data from file");

    }

    @Override
    public void remove() {
        System.out.println("Delete");
    }

    @Override
    public void checkPermission() {

        System.out.println("permission Granted From FileLoader");
    }
}
