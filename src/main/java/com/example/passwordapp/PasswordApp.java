package com.example.passwordapp;

import com.example.PasswordGenerator;

public class PasswordApp {

    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generatePassword(10);
        System.out.println("Generated Password: " + password);
    }
}

