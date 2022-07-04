package com.company.repository;

public class MemoryRepositoryService implements Repository{
    @Override
    public void save() {
        System.out.println("Saving In Memory");
    }
}
