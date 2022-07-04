package com.company.Concurrency.Test;


import com.company.Concurrency.Domain.Members;
import com.company.Concurrency.service.EmailDelivaryService;

import javax.swing.*;

public class EmailDelivaryTest1 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread mahmoud = new Thread(new EmailDelivaryService(members), "Mahmoud");
        Thread essam = new Thread(new EmailDelivaryService(members), "Essam");
        mahmoud.start();
        essam.start();
        while(true) {
           String email = JOptionPane.showInputDialog("Please Type Your Email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);

        };

    }
}
