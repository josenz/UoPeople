// You will create a separate class for quiz question,

//   and you will create objects of that class to ask
//   questions and ask answers.



import javax.swing.JOptionPane;

public class FirstQuiz {

    static int nQuestions = 0;
    static int nCorrect = 0;

    public static void main(String[] args) {

        String question1 = "Which one of the following is NOT part of the signature of a Java method?\n";
        
        question1 += "\n";
        question1 += "A. Method name\n";
        question1 += "\n";
        question1 += "B. Names of formal parameters\n";
        question1 += "\n";
        question1 += "C. Number of formal parameters\n";
        question1 += "\n";
        question1 += "D. Types of formal parameters\n";
        question1 += "\n";
        question1 += "E. Number of dummy parameters\n";


        String question2 = "Consider the following first line from a Java method definition:\n";
        question2 += "\n";
        question2 += "    public static boolean compute(int n, float x) {\n";
        question2 += "\n";
        question2 += "Which one of the following lines could begin a method that legally overloads the above method?\n";
        question2 += "\n";

        question2 += "A. private static boolean compute(int n, float x) {\n";
        question2 += "\n";
        question2 += "B. public boolean compute(int n, float x) {\n";
        question2 += "\n";
        question2 += "C. public static int compute(int n, float x) {\n";
        question2 += "\n";
        question2 += "D. public static boolean compute(float n, int x) {\n";
        question2 += "\n";
        question2 += "E. public static boolean compute(int x, float n) {\n";


        String question3 = "Consider the following Java method, which term best describes \"void\"?\n";
        question3 += "\n";
        question3 += "            public static void main(String[] args) {\n";
        question3 += "                System.out.println(\"Hello, World!\");\n";
        question3 += "            }\n";
        question3 += "\n";

        question3 += "A. actual parameter or argument\n";
        question3 += "B. formal parameter\n";
        question3 += "C. method call\n";
        question3 += "D. modifier\n";
        question3 += "E. return type\n";

        String question4 = "Assume \"test\" is a boolean variable." +
                           " Which of the following expressions is equivalent to \"test == true\"?\n";
        
        question4 += "\n";
        question4 += "A. test\n";
        question4 += "B. !test\n";
        question4 += "C. test = true\n";
        question4 += "D. test.equals(true) \n";
        question4 += "E. N.A\n";

        String question5 = "In a for loop, how many times does the initialization run?\n";

        question5 += "\n";
        question5 += "A. At least once, at the beginning of each iteration.\n";
        question5 += "B. At least once, at the end of each iteration.\n";
        question5 += "C. Exactly once.\n";
        question5 += "D. Zero or more times, at the beginning of each iteration.\n";
        question5 += "E. Zero or more times, at the end of each iteration.\n";

        check(question1, "B");
        check(question2, "D");
        check(question3, "E");
        check(question4, "A");
        check(question5, "C");

        JOptionPane.showMessageDialog(null, nCorrect + " Correct out of " + nQuestions + " questions");
        
    }

     static String ask(String question) {

        while(true) {

            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E.");
                continue;
            }
        }
        
    }

     static void check(String question, String correctAnswer) {

        nQuestions++;
        String answer = ask(question);

        if(answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct Answer! ");
            nCorrect++;
        } else { 
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }
    }

}