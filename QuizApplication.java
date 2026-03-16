
import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            int score = 0;

            String[] questions = {
                    "1. Which language is used for Android Development?",
                    "2. Who developed Java?",
                    "3. Which keyword is used to create a class in Java?",
                    "4. Which data type stores whole numbers?",
                    "5. Which company owns Java?"
            };

            String[][] options = {
                    {"A. Python", "B. Java", "C. C++", "D. Swift"},
                    {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
                    {"A. function", "B. method", "C. class", "D. define"},
                    {"A. float", "B. String", "C. int", "D. boolean"},
                    {"A. Google", "B. Microsoft", "C. Oracle", "D. IBM"}
            };

            char[] answers = {'B', 'A', 'C', 'C', 'C'};

            for (int i = 0; i < questions.length; i++) {

                System.out.println(questions[i]);

                for (int j = 0; j < options[i].length; j++) {
                    System.out.println(options[i][j]);
                }

                System.out.print("Enter your answer (A/B/C/D): ");
                char userAnswer = sc.next().toUpperCase().charAt(0);

                if (userAnswer == answers[i]) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer: " + answers[i] + "\n");
                }
            }

            System.out.println("Quiz Finished!");
            System.out.println("Your Score: " + score + "/" + questions.length);

            System.out.print("Do you want to continue the quiz? (Y/N): ");
            choice = sc.next().toUpperCase().charAt(0);

        } while (choice == 'Y');

        System.out.println("Thank you for playing the quiz!");

        sc.close();
    }
}


    

