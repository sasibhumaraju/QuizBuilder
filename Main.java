
public class Main {
    public static void main(String[] args) {
        System.out.println( "\n\n\n########### Welcome to quiz..#########\n\n");

        QuestionService quiz = new QuestionService();
        quiz.playQuiz();
        quiz.displayScore();
    }

}
