# 📝 Java Console-Based Quiz App

This is a simple **console-based quiz application** built in Java as part of an internship task.  
The application allows users to **attempt multiple-choice questions** and **view their score** at the end.

---

## 📁 Project Structure

Day8/<br>
├── src/<br>
│      └── com/<br>
│       └── quizapp/<br>
│           ├── Main.java<br>
│           ├── model/<br>
│           │   └── Question.java<br>
│           ├── service/<br>
│           │   └── QuizService.java<br>
│           └── util/<br>
│               └── QuestionBank.java<br>

---

## 🚀 Features

- 🎯 **Welcome Screen**: Option to start quiz or exit.
- ❓ **Multiple Questions**: Displays 5 multiple-choice questions.
- 🔀 **Random Order**: Questions appear in a different order each time.
- ✅ **Score Calculation**: Displays total score after the quiz.
- ⌨️ **Keyboard Input**: Simple text-based user input.

---

## 🧠 How It Works

- **Question Class** stores the question, options, and correct answer index.
- **QuestionBank** contains a predefined list of quiz questions.
- **QuizService** handles displaying questions, reading user answers, and calculating the score.
- **Main** shows the welcome message and starts or exits the quiz based on user choice.
- Uses **Java Collections** to store and shuffle questions.

---
## 💡 Sample Console Interaction

======================================<br>
  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 🎯 Welcome to the Online Quiz App<br>
======================================<br>

Press ENTER to START the quiz
       OR
Type 'esc' to EXIT<br>

--------------------------------------

Your choice: (user presses Enter)
Q. Which company originally developed Java?
  1. Microsoft
  2. Sun Microsystems
  3. Google
  4. Oracle
Enter your choice (1-4): 2
✅ Correct!
...
🎯 Quiz Completed!
Your Score: 4/5


---

## 🛠️ Tech Stack

- **Language**: Java  
- **Type**: Console Application  
- **IDE**: IntelliJ Community Edition / Eclipse  
- **JDK**: Java SE 21  

---

## ▶️ How to Run

1. Clone or download this repository.  
2. Open it in **IntelliJ CE** or **Eclipse**.  
3. Run `Main.java` as a **Java Application**.  
4. Follow on-screen instructions to take the quiz.

---

## 👤 Author

[**Adarsha Kumar Maharana**](https://adarsha.me) <br>
Intern @ Elevate Labs  
📅 *15-August-2025*

---

## 📃 License

This project is provided for educational purposes.  
Feel free to use or modify it to enhance your Java console programming skills.

