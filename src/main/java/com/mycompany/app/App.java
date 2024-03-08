package com.mycompany.app;

public class App {

    private static final String MESSAGE = "Hello World!!Change was mage in text";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
