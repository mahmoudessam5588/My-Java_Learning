package com.company.JavaIOTest;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("Folder4/Subfolder1/subfolder2/file.bkp");
        Path path2 = Paths.get("Folder4/Subfolder1/subfolder2/file.txt");
        Path path3 = Paths.get("Folder4/Subfolder1/subfolder2/file.java");
        matches(path1,"glob:**/*.bkp");
        matches(path2,"glob:**/*.{bkp,java,txt}");
        matches(path2,"glob:**/*.???");
    }
    private static void matches(Path path , String glob){
        PathMatcher asDefault = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " : "+ asDefault.matches(path));


    }
}
