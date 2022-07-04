package com.company.InterfacesExample;

public class Main {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
        fileLoader.remove();
        fileLoader.checkPermission();
    }
}
