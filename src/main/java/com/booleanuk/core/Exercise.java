package com.booleanuk.core;

public class Exercise {
    public static String sayHelloWorld() {
        return "Hello, world!";
    }


    public static void main(String[] args) {
        activityOne(12);
        activityTwo(12,12);
        System.out.println( formatedVersion(new String[]{"Tempest","William Shakespeare","100"}));


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

    public static double aritmeticMean(int[] numbers){
        double mean = 0;
        for (int item :
                numbers) {
            mean+=item;
        }
      return mean/numbers.length;
    }

    public static double stringMean(String[] words){
        double mean = 0;
        for (String word :
                words) {
            mean+=word.length();
        }
        return mean/words.length;
    }

    public static String formatedVersion(String[] info){
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < info.length; i++){
            sb.append(info[i]+" ");
        }


        return sb.toString();
    }


}
