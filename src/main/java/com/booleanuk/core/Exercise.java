package com.booleanuk.core;

public class Exercise {
    public static String sayHelloWorld() {
        return "Hello, world!";
    }


    public static void main(String[] args) {
        loop(12);
        loopTwo(12,12);

    }


    public static void loop(int number) {
        for (int i = 1; i <= 12; i++){
            System.out.println(number*i);
        }
    }

    public static void loopTwo(int number, int multiply) {
        for (int i = 1; i <= multiply; i++){
            System.out.println(number*i);
        }
    }
}
