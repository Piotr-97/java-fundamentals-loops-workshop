package com.booleanuk.core;

public class Exercise {
    public static String sayHelloWorld() {
        return "Hello, world!";
    }


    public static void main(String[] args) {
        activityOne(12);
        activityTwo(12,12);

    }


    public static void activityOne(int number) {
        for (int i = 1; i <= 12; i++){
            System.out.println(number*i);
        }
    }

    public static void activityTwo(int number, int multiply) {
        for (int i = 1; i <= multiply; i++){
            System.out.println(number*i);
        }
    }
}
