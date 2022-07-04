package com.company.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {
            log();
        } catch (LoginInValidException e) {
            e.printStackTrace();
        }

    }
    private static void log() throws LoginInValidException {
        Scanner scanner = new Scanner(System.in);
        String username = "Mahmoud";
        String password = "INTJ";
        System.out.println("Username: ");
        String TypedUser = scanner.nextLine();
        System.out.println("Password: ");
        String TypedPassword = scanner.nextLine();
        if(!username.equals(TypedUser)|| !password.equals(TypedPassword)){
            throw new LoginInValidException("Invalid Entry Try Again");
        }
        System.out.println("Login Succeed");
    }
}
