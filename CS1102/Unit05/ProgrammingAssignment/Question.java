import javax.swing.JOptionPane;

public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    abstract String ask(); // New Line!

    String question;
    String correctAnswer;

     public void check() {

        nQuestions++;
        String answer = ask(); // Will use the method defined in the subclasses 

        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct Answer! ");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }
    }

    static void showResults() {

        JOptionPane.showMessageDialog(null, nCorrect + " Correct out of " + nQuestions + " questions");
    }
}