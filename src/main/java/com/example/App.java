package com.example;

import com.example.service.SimpleService;

/**
 * Main application class
 */
public class App {
    public static void main(String[] args) {
        SimpleService service = new SimpleService();
        System.out.println(service.getMessage());
    }
}