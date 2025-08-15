package com.quizapp.util;

import com.quizapp.model.Question;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "What is the capital of India?",
            new String[]{"1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai"},
            2
        ));

        questions.add(new Question(
            "Which company originally developed Java?",
            new String[]{"1. Microsoft", "2. Sun Microsystems", "3. Google", "4. Oracle"},
            2
        ));

        questions.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"1. implement", "2. inherit", "3. extends", "4. super"},
            3
        ));

        questions.add(new Question(
            "Which data structure uses LIFO (Last In First Out)?",
            new String[]{"1. Queue", "2. Stack", "3. LinkedList", "4. Array"},
            2
        ));

        questions.add(new Question(
            "Which method is the entry point of a Java program?",
            new String[]{"1. start()", "2. main()", "3. run()", "4. execute()"},
            2
        ));

        // Randomize question order
        Collections.shuffle(questions);
        return questions;
    }
}
