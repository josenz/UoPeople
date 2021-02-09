import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question{

    public TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: " + question;
        this.correctAnswer = answer;
    }

    String ask() {

        while (true) {

            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("F") || answer.equals("FALSE")
                    || answer.equals("N") || answer.equals("NO") 
                    || answer.equals("T") || answer.equals("TRUE")
                    || answer.equals("Y") || answer.equals("YES")) {
                switch (answer) {
                    case "F":
                        answer = "FALSE";
                        break;
                    case "FALSE":
                        answer = "FALSE";
                        break;
                    case "N":
                        answer = "FALSE";
                        break;
                    case "NO":
                        answer = "FALSE";
                        break;
                    case "T":
                        answer = "TRUE";
                        break;
                    case "TRUE":
                        answer = "TRUE";
                        break;
                    case "Y":
                        answer = "TRUE";
                        break;
                    case "YES":
                        answer = "TRUE";
                        break;
                    default:
                        break;
                }        
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter \"TRUE\" or \"FALSE\"");
                continue;
            }

        }
    }

}