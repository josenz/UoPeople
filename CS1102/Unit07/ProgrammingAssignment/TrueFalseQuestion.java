// import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

public class TrueFalseQuestion extends Question{

    public TrueFalseQuestion(String question, String answer) {
        
        // this.question = new QuestionDialog();
        // this.question.setLayout(new GridLayout(0,1));
        // this.question.add(new JLabel("     " +question+ "     ", JLabel.CENTER));
        super(question);
       
        JPanel buttons = new JPanel();
        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");
        this.question.add(buttons);
       
        // this.question.setModal(true);
        // this.question.pack();
        // this.question.setLocationRelativeTo(null);
        initQuestionDialog();

        this.correctAnswer = answer;
    }

    // String ask() {  
    //     // This will "turn on" the "question" dialog box, which runs until
    //     //   it calls "dispose".
    //     question.setVisible(true);
    //     return question.answer;
    // }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }

}