package com.company.repository;

public class FileRepositoryService implements Repository{
    @Override
    public void save() {
        System.out.println("Saving In The File");
    }
}
