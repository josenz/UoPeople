import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {

    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    public MultipleChoiceQuestion(String query, String a, String b, String c,
                                        String d, String e, String answer) {

        // (Notice that the parameter names for the constructor are all different 
        // from the instance variable names
        // so that they can be distinguished. In the next unit, you will learn 
        // how to distinguish between parameters
        // and instance variables with the same name.)

        // Have the constructor initialize the -> instance variables <- using its parameters.

        // • Initialize "question" using the "query" parameter followed by each choice
        // parameter, "a"-"e".
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";

        correctAnswer = answer;
        correctAnswer = correctAnswer.toUpperCase();

        
    }

    String ask() {

        while (true) {

            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")
                    || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E.");
                continue;
            }

        }
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

    static void showResults() {

        JOptionPane.showMessageDialog(null, nCorrect + " Correct out of " + nQuestions + " questions");
    }


        
}