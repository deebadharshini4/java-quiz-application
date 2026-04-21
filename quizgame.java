import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. What is Java?",
                "2. Which keyword is used for inheritance?","3. What is size of int in Java?"
        };

        String[][] options = {
                {"1. Programming Language", "2. Operating System", "3. Browser", "4. Database"},
                {"1. implements", "2. extends", "3. inherit", "4. super"},
                {"1. 2 bytes", "2. 4 bytes", "3. 8 bytes", "4. Depends on system"}
        };

        int[] answers = {1, 2, 2};

        int score = 0;
        int guess;

        System.out.println("******** JAVA QUIZ ********");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

           
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: ");
            }

            System.out.println();
        }

        System.out.println("Final Score: " + score + "/" + questions.length);

        scanner.close();
    }
}