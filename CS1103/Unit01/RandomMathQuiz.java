import java.util.Scanner;

import javax.swing.JOptionPane;
// Programming Exercise: Random Math Quiz

// To get you started with Eclipse and to help you get back into programming at the start of a new semester, 
//  this lab includes a moderately complex programming assignment. Remember that your program will be graded 
//  for style as well as for correctness. It should follow all the rules in the style guide (a link for which 
//  is available from the Resources sidebar on the course page), including the use of Javadoc comments (see below).


// You should try to write your program in a way that will make it easy to modify and improve. For example, you wouldn't 
// want to hard code the number of questions as a literal constant in your program, would you? The preferred way to write 
// the program is to define classes to represent the concepts that occur in the problem. You will create one such class 
// (along with the main program) as part of your introduction to Eclipse. It's up to you whether you actually use this class 
// (and possibly improve it) and whether you create additional classes. You should do so only if you are comfortable with the 
// idea -- the most important thing is to have a working program.

// This is a non-gradable project, so you do not have to turn in your work.



// A perfect program should run correctly; it should provide a good user experience with reasonable math problems and nice, 
// clear I/O; and should follow all the rules of good programming style. 

public class RandomMathQuiz {

    // The assignment is to write a program that administers and grades a math quiz
    // with randomly generated questions of several different kinds. 
    // You should target the quiz at an
    // elementary school student who
    // is learning basic arithmetic. The questions should ask the student to perform
    // simple addition, subtraction,
    // multiplication, and division problems. You can include other problems, such
    // as finding remainders, if you want.
    // You should probably stick to integers with a small number of digits.

    // Quiz -> Randomly -> addition | subraction | multiplication | division

    // For each question, the type of problem should be selected at random, and then
    // the numbers that occur in the problem
    // should be randomly generated. 

    public static void main(String[] args) {

        // String head = "What is the result of 2 + 4?";

        Scanner in = new Scanner(System.in);
        System.out.println("How many Mathematic questions would you like to answer?");
        int howManyQuestions = in.nextInt();

        Question typeQuestion;

        // System.out.println(howManyQuestions);

        // An outstanding program must also exhibit a good 
        // design that will make it easy to extend the program, 
        // for example to use a different number of questions, 
        // different types of questions, and possibly different scoring rules.

        for (int i = 0; i < howManyQuestions; i++) {
            
            int kindQuestion = randomNumber();
            int number01 = randomNumber();
            int number02 = randomNumber();
            
            switch (kindQuestion) {
                case 2:
                    // creates an instance of the question object
                    // passing the type of addition question.
                    typeQuestion = new Question("+", number01, number02);
                    typeQuestion.check();
                    break;

                case 4:
                    // creates an instance of the question object
                    // passing the type of subtraction question.
                    typeQuestion = new Question("-", number01, number02);
                    typeQuestion.check();
                    break;

                case 6:
                    // creates an instance of the question object
                    // passing the type of multiplication question.
                    typeQuestion = new Question("*", number01, number02);
                    typeQuestion.check();
                    break;

                case 8:
                    // creates an instance of the question object
                    // passing the type of division question.
                    typeQuestion = new Question("/", (number01 * number02), number02);
                    typeQuestion.check();
                    break;

                default:
                    // (Hint: To get a reasonable division problem,
                    // a/b, select b and the answer at random,
                    // and compute the value of a.)
                    // System.out.print("Division");
                    typeQuestion = new Question("/", (number01 * number02), number02);
                    typeQuestion.check();
                    break;
            }
            
            if (i == (howManyQuestions - 1)) {
                typeQuestion.showResults();
            }
        }
    }

    public static int randomNumber() {

        int n = (int) (Math.random()*(10 - 1)) + 1;
        return n;
    }


    // The quiz consists of ten questions. At the end of the quiz, output a score
    // along with the number of questions that
    // the user got right on the first try and the number of questions that the user
    // got right on the second try.

    public static class Question {
        

        static int nQuestion;
        static int nCorrect;
        static double userScore;

        String question;
        int correctAnswer;
        int userAnswer;

        public Question(String operator, int number01, int number02) {

            switch (operator) {
                case "+":
                question = "What is the result of " + number01 + " + " + number02;
                correctAnswer = number01 + number02;
                    break;
            
                case "-":
                    // System.out.print("Subtraction");
                    question = "What is the result of " + number01 + " - " + number02;
                    correctAnswer = number01 - number02;
                    break;
            
                case "*":
                    // System.out.print("Multiplication");
                    question = "What is the result of " + number01 + " * " + number02;
                    correctAnswer = number01 * number02;
                    break;
            
                case "/":
                    question = "What is the result of " + number01 + " / " + number02;
                    correctAnswer = number01 / number02;
                    break;
            
                default:
                    question = "What is the result of " + number01 + " + " + number02;
                    correctAnswer = number01 + number02;
                    break;
            }
        }

        int ask() {

            int answer = Integer.parseInt(JOptionPane.showInputDialog(question));
            return answer;
        }

        void check() {
            nQuestion++;
            // System.out.println(nQuestion);
            int numberTry = 0;
            
            
            // The user should have two chances to get the right answer.
            
            while (numberTry < 2) {

                int userAnswer = ask();
                if (userAnswer == correctAnswer && numberTry == 0) {
                    // If the user gets the correct answer to a problem on the
                    // first try, they get full credit for the problem.
                    // System.out.println("Correct Answer!");
                    nCorrect++;
                    userScore+= 1;
                    break;
                } else if (userAnswer == correctAnswer && numberTry == 1) {
                    // If not, they get a second
                    // try. If the user gets the correct answer
                    // on the second try, they get half credit.
                    userScore+= 0.5;
                    nCorrect++;
                    break;
                }
                else {
                    if (numberTry == 1) {
                        // If the user fails to get the correct
                        // answer after two tries, tell the user
                        // the correct answer.
                        // System.out.printf("Wrong answer, the correct answer was %d", correctAnswer);
                        JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
                        System.out.print("\n");
                    }
                    numberTry++;
                }
            }

        } // end method check()

        public void showResults() {
            // System.out.println(nCorrect + " Correct out of " + nQuestion + " questions");
            JOptionPane.showMessageDialog(null, nCorrect + " Correct out of " + nQuestion + " questions, total score: " + userScore);
        }

    } // end Class Question

} // end Class RandomMathQuiz
