package com.company.Serilization.FirstDomain;

import java.io.*;

public class StudentClass<seminar> implements Serializable {
    @Serial
    private static final long serialVersionUID = 5948739485569941678L;
    private transient SeminarClass  seminar;
    private long id;
    private String name;
    private transient String password;

    public SeminarClass getSeminar() {
        return seminar;
    }

    public void setSeminar(SeminarClass seminar) {
        this.seminar = seminar;
    }
    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(seminar.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        private void ReadObject(ObjectInputStream ois){
            try {
                ois.readObject();
                String seminar = ois.readUTF();
                this.seminar = new SeminarClass(seminar);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }





    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", seminar='" + seminar + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentClass(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }



}
