package chapterSeven;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
         String question1 = """
                1 .Examples Of A Noun.
                a. Joy
                b. Adverb
                c. Mobilize
                """;

        String question2 = """
                2. Examples Of A Verb.
                a. Joy
                b. Adverb
                c. Mobilize
                """;

        String question3 = """
                3 .Examples Of A Verb.
                a. Joy
                b. Adverb
                c. Mobilize
                """;

    Question[] questions = {
            new Question(question1, "a"),
            new Question(question2, "c"),
            new Question(question3, "c")


    };
    attemptTest(questions);
    }

    public static void attemptTest(Question[] questions){
        int score = 0;
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].promptQuestion);
            String answers = userInput.next();
            if (answers.equalsIgnoreCase(questions[i].answer)) {
                score+=5;
            }
        }
        if (score >= 10) {
            System.out.println("you score  :    " + score + "/" + 15);
            System.out.println("Excellent");
        }
        else {
            System.out.println("you score  :    " + score + "/" + 15);
            System.out.println("Poor");
        }
    }
}
