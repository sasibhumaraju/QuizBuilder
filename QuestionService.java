import java.util.Scanner;

public class QuestionService {
    private Question[] questions;
    private String[] userAnswers;

    QuestionService() {
        questions = new Question[5];
        userAnswers = new String[5];
        questions[0] = new Question(1, "Who invented java?", generateOptionsArray("James Gosling","Denis", "Van russum", "Straut") , "James Gosling");
        questions[1] = new Question(2, "Java is?", generateOptionsArray("Object Oriented","Functional") , "Object Oriented");
        questions[2] = new Question(3, "Name a java framework?", generateOptionsArray("Spring", "React", "Angular") ,"Spring");
        questions[3] = new Question(4, "Which keyword is used to create object in java?", generateOptionsArray("new", "newInstance") , "new");
        questions[4] = new Question(5, "Java Supports multiple inheritance?", generateOptionsArray("Yes","No") , "No");
    }

    private String[] generateOptionsArray (String ... options) {
        return options;
    }

    void playQuiz() {
        System.out.println("(i) -> Hello! User, Type the answers to play quiz.\n");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (Question question : questions) {
                System.out.println("\n\n"+question.getId() + ") " + question.getQuestion() + "\noptions: ");
                for (String option : question.getOptions()) {
                    System.out.print(option + ", ");
                }
                System.out.print("\n\nType Your Answer: ");
                
                String answer = sc.nextLine();
                userAnswers[i++] = answer;
               
        }
        sc.close();
        System.out.println("\n########## Happy! Quiz completed.. ############\n");
    }

    void displayScore() {
        int i = 0;
        int score = 0;
        for (String ans : userAnswers) {
            if( ans.equalsIgnoreCase(questions[i++].getAnswer())) score++;
        }
        System.out.println("Your Score: "+score);
    }

}
