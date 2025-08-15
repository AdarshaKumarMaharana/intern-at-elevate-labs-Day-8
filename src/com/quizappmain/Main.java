package com.quizappmain;

import com.quizapp.service.QuizService;
import com.quizapp.util.QuestionBank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   🎯 Welcome to the Online Quiz App  ");
        System.out.println("======================================");
        System.out.println("Press ENTER to START the quiz");
        System.out.println("       OR");
        System.out.println("Type 'esc' to EXIT");
        System.out.println("--------------------------------------");
        System.out.print("Your choice: ");
        

        String choice = sc.nextLine().trim();

        if (choice.equalsIgnoreCase("esc")) {
            System.out.println("👋 Thank you! Exiting the Quiz. Goodbye!");
            sc.close();
            return; // Exit program
        }

        // Start the quiz
        QuizService quiz = new QuizService();
        quiz.startQuiz(QuestionBank.getQuestions());
    }
}
