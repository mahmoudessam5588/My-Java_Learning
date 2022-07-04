package com.company.Serilization.FirstDomain.Test;

import com.company.Serilization.FirstDomain.SeminarClass;
import com.company.Serilization.FirstDomain.StudentClass;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SeralizationTest1 {
    public static void main(String[] args) {
        StudentClass student = new StudentClass(5588L,"Mahmoud","123456");
        SeminarClass sem = new SeminarClass("Dev Dojo Class");
        student.setSeminar(sem);
        serializer(student);
        deserializer();

    }
    public static void serializer (StudentClass student) {
        Path path = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/Folder3/ser.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(student);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void deserializer () {
        Path path = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/Folder3/ser.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            StudentClass student = (StudentClass) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    }

