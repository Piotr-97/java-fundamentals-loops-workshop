package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathQuiz {

    static List<Integer> userAnswers = new ArrayList<>();
    static List<Integer> answers = new ArrayList<>();

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(generateQuestion()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many questions?");
        int howMany = scanner.nextInt();
        for (int i = 0; i < howMany; i++) {
            int[] question = generateQuestion();
            System.out.println("Question " + i + ": " + question[0] + " * " + question[1]);
            int userAnswer = scanner.nextInt();
            userAnswers.add(userAnswer);
            answers.add(question[2]);
        }
        int counter = 0;
        for (int i = 0; i < userAnswers.size(); i++) {

            if (userAnswers.get(i) == answers.get(i)) {
                counter++;
            }
        }
        System.out.println("Correct answers: " + counter);
    }


    public static int[] generateQuestion() {
        int[] question = new int[3];

        question[0] = (int) (Math.random() * 10) + 1;
        question[1] = (int) (Math.random() * 10) + 1;
        question[2] = question[0] * question[1];
        return question;
    }


}
