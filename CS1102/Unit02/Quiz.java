import textio.TextIO;
import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {

        String question = "What OOP stands for?\n";

        question += "A. OOP stands for Ordinary Object Program\n";
        question += "B. OOP stands for Overall Objects Programming\n";
        question += "C. OOP stands for Object Ordem Programming\n";
        question += "D. OOP stands for Object Oriented Programming\n";
        question += "E. OOP stands for Orient Objects Programer\n";
        
        do {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            
            if(answer.equals("D")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if(answer.equals("A")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            } else if(answer.equals("B")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            } else if(answer.equals("C")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            } else if(answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E.");
            }
        } while (true);
        
    }

}