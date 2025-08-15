package com.quizapp.service;

import com.quizapp.model.Question;
import java.util.List;
import java.util.Scanner;

public class QuizService {
    private int score = 0;

    public void startQuiz(List<Question> questions) {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("\n" + q.getQuestion());
            for (String opt : q.getOptions()) {
                System.out.println(opt);
            }

            System.out.print("Enter your choice (1-4): ");
            int answer;
            try {
                answer = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Skipping question.");
                sc.nextLine();
                continue;
            }

            if (answer == q.getCorrectOption()) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is option " + q.getCorrectOption());
            }
        }

        System.out.println("\n🎯 Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.size());

        sc.close();
    }
}
