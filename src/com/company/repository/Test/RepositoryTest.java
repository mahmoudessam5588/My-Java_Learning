package com.company.repository.Test;

import com.company.repository.DataBaseRepositoryService;
import com.company.repository.FileRepositoryService;
import com.company.repository.MemoryRepositoryService;
import com.company.repository.Repository;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repoData = new DataBaseRepositoryService();
        Repository repoMemory = new MemoryRepositoryService();
        Repository repoFile = new FileRepositoryService();
        repoData.save();
        repoMemory.save();
        repoFile.save();

    }
}
