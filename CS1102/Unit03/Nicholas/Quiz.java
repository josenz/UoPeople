import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {

        //String question;
        String question01 ="where is Ghana\n";
        
        question01 += "A. Africa\n";
        question01 += "B. Asia\n";
        question01 += "C. America\n";
        question01 += "D. Australia\n";
        question01 += "E. China\n";
       
        // TODO Auto-generated method stub
        String question02 = "what is a parasite?\n";

        question02 += "A. Any living organism that lives on or inside the body of it's host\n";
        question02 += "B. A living organism\n";
        question02 += "C. A pest that destroy crops\n";
        question02 += "D. A living organism that feed on another organism for only food\n";
        question02 += "E. A dead organism\n";

        String question03 = "";

        // Call the method "check". It should take two String parameters:
        // static void check(String question, String correctAnswer) {

        // Replace the "ask" call in the main method with a "check" call. You will need to provide
        // both  -- the question String and the answer String -- as arguments.

        // Run your program. It should keep asking the question until you provide a valid answer.
        // Then it should tell you if your answer is correct.

        // Try invalid, incorrect, and correct answers.

        // In the main method, call "check" with at least two more unique quiz questions, each with
        // a different correct answer, for a total of at least three questions.

        // Run your program. Make sure the responses work as expected for all the questions.

        // Finally, add a score for the quiz:
        // Add two static member variables, one for the number of questions and one for the
            // number of correct answers. Initialize them to zero for good documentation.
        // static int nQuestions = 0;
        // static int nCorrect = 0;

        // Remember where member variables go: inside a class definition but outside all method
        // definitions. You may declare the variables before, after, or between the existing methods.

        // In the "check" method, increment "nQuestions" each time it is called.

        // Also in the "check" method, increment "nCorrect" for each correct answer.

        // Display the score at the end of the main method using
        // "JOptionPane.showMessageDialog". Use the text, " correct out of questions", with the
        // appropriate numbers.

        // Run your program. Make sure it displays the right numbers of questions and correct
        // answers.

    }

    // Add a static method that asks a question until the user provides valid input.
    // It should take a String parameter, and it should return a String:
    //static String ask(String question) {
    static String ask(String question) {

        // Notice that the method does not check whether the answer is correct. It just asks the same
        // question until the answer is valid.

        // Ask the user the question repeatedly until the user provides a valid 
        // answer: "A", "B", "C","D", or "E".
        // Ask the question using "JOptionPane.showInputDialog".
        String answer = JOptionPane.showInputDialo(null, question);

        // Allow the user to provide a lower-case answer, and convert it to upper case.
        answer = answer.toUpperCase();

        if(answer.equals("A") || answer.equals("B") answer.equals("C") || answer.equals("D") || answer.equals("E"))
            // Once the user provides a valid answer, return that answer (converted to upper case).
        else
            // If the user provides an invalid answer, use "JOptionPane.showMessageDialog" to tell
            // them, "Invalid answer. Please enter A, B, C, D, or E." Then ask the question again.
            // Repeat until the answer is valid.

    }

    // Now add a method that asks questions using "ask" and checks answers.
    // In the "check" method, call "ask" to get a valid answer:
    // String answer = ask(question);

    // If the answer is correct, use "JOptionPane.showMessageDialog" to report, "Correct!"

    // If the answer is incorrect, use "JOptionPane.showMessageDialog" to report:
    // "Incorrect. The correct answer is ." This output should include the actual correct answer.

}