// import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    //abstract String ask(); // Defined in the subclasses: TrueFalseQuestion and MultipleChoiceQuestion

    QuestionDialog question;
    String correctAnswer;

    Question(String question) {
        this.question = new QuestionDialog();
        // this.question.setLayout(new GridLayout(0, 1));
        this.question.setLayout(new BorderLayout());
        // this.question.add(new JLabel("     " + question + "     ", JLabel.LEFT));
        JLabel myQuestion = new JLabel();
        myQuestion.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        myQuestion.setText("<html><body>" + question + "</body></html>");
        this.question.add(myQuestion);
    }


    void check() {
        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct Answer! ");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }
    }

    String ask() {
        // This will "turn on" the "question" dialog box, which runs until
        // it calls "dispose".
        question.setVisible(true);
        return question.answer;
    }

    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " Correct out of " + nQuestions + " questions");
    }
}