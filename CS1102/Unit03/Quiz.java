import javax.swing.JOptionPane;

public class Quiz {

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

        String question6 = "Which of the following keywords is useful for processing lists of menu options?\n";

        question6 += "\n";
        question6 += "A. break\n";
        question6 += "B. continue\n";
        question6 += "C. do\n";
        question6 += "D. switch\n";
        question6 += "E. while\n";

        String question7 = "Consider the following Java method, which term best describes \"String[] args\"?\n";

        question7 += "\n";
        question7 += "    public static void main(String[] args) {\n";
        question7 += "        System.out.println(\"Hello, World!\");\n";
        question7 += "    }";

        question7 += "\n";
        question7 += "A. Actual parameter or argument.\n";
        question7 += "B. Formal parameter.\n";
        question7 += "C. Method call.\n";
        question7 += "D. Modifier.\n";
        question7 += "E. Return type.\n";

        String question8 = "What is the output of the following Java program?\n";

        question8 += "    class Sum {\n";
        question8 += "        static int sum = 0;\n";
        question8 += "        static void add(int i) { sum += i; }\n";
        question8 += "        public static void main(String[] args) {\n";
        question8 += "            for (int i = 0; i < 10; i++) add(i);\n";
        question8 += "            System.out.println(sum);\n";
        question8 += "        }\n";
        question8 += "    }\n";

        question8 += "\n";
        question8 += "A. 0\n";
        question8 += "B. 9\n";
        question8 += "C. 10\n";
        question8 += "D. 45\n";
        question8 += "E. 100\n";

        String question9 = "Which one of the following is NOT part of the signature of a Java method?\n";

        question9 += "\n";
        question9 += "A. Method name.\n";
        question9 += "B. Names of formal parameters.\n";
        question9 += "C. Number of formal parameters.\n";
        question9 += "D. Types of formal parameters.\n";
        question9 += "E. Number of parameters.\n";

        String question10 = "Which of the following keywords is useful for getting out of an infinite loop?\n";

        question10 += "\n";
        question10 += "A. break\n";
        question10 += "B. continue\n";
        question10 += "C. do\n";
        question10 += "D. switch\n";
        question10 += "E. while\n";

        String question11 = "Consider the following Java method, which term best describes \"public\"?\n";

        question11 += "\n";
        question11 += "    public static void main(String[] args) {\n";
        question11 += "        System.out.println(\"Hello, World!\");\n";
        question11 += "    }\n";

        question11 += "\n";
        question11 += "A. Actual parameter or argument.\n";
        question11 += "B. Formal parameter.\n";
        question11 += "C. Method call.\n";
        question11 += "D. Modifier.\n";
        question11 += "E. Return type.\n";

        String question12 = "Which one of the following lines is a Java method call?\n";

        question12 += "\n";
        question12 += "A. import javax.swing.JOptionPane;\n";
        question12 += "B. int x = 0;\n";
        question12 += "C. compute();\n";
        question12 += "D. return y;\n";
        question12 += "E. void compute() {}\n";

        String question13 = "A Java method gets executed when it is...\n";

        question13 += "\n";
        question13 += "A. called \n";
        question13 += "B. compiled \n";
        question13 += "C. declared \n";
        question13 += "D. defined. \n";
        question13 += "E. imported \n";

        String question14 = "Which one of the following terms does NOT describe" + 
                                        " a desirable interface to a black box?\n";
        
        question14 += "\n";
        question14 += "A. easy to understand\n";
        question14 += "B. implementation \n";
        question14 += "C. public\n";
        question14 += "D. specification\n";
        question14 += "E. straightforward\n";

        String question15 = "What is output by the following Java program?\n";

        question15 += "    class Zap {\n";
        question15 += "        static boolean zap() { return true; } \n";
        question15 += "        static int zap(boolean x) { return 0; }\n";
        question15 += "        static double zap(int x) { return 0.5; }\n";
        question15 += "        static String zap(double x) { return \"Zap!\"; }\n";
        question15 += "        static boolean zap(String x) { return false; }\n";
        question15 += "        public static void main(String[] args) {\n";
        question15 += "            System.out.println(zap(zap(zap(zap()))));\n";
        question15 += "        }\n";
        question15 += "    }\n";

        question15 += "\n";
        question15 += "A. true\n";
        question15 += "B. 0\n";
        question15 += "C. 0.5\n";
        question15 += "D. Zap!\n";
        question15 += "E. false\n";

        String question16 = "What is output by the following Java program?\n";

        question16 += "    class Compute {\n";
        question16 += "        static int compute() { return 42; }\n";
        question16 += "        static int compute(int i) { return i+1; }\n";
        question16 += "        public static void main(String[] args) {\n";
        question16 += "            System.out.println(compute(compute()));\n";
        question16 += "        }\n";
        question16 += "    }\n";

        question16 += "\n";
        question16 += "A. 0\n";
        question16 += "B. 1\n";
        question16 += "C. 2\n";
        question16 += "D. 42\n";
        question16 += "E. 43\n";

        String question17 = "Where in a Java file can the text \"int x\" NOT appear?\n";

        question17 += "\n";
        question17 += "A. In a class definition but outside a method definition\n";
        question17 += "B. In a for statement\n";
        question17 += "C. In a method call\n";
        question17 += "D. In a method definition\n";
        question17 += "E. In a method parameter list\n";

        String question18 = "What is the output of the following Java program?\n";

        question18 += "\n";
        question18 += "    class Sum {\n";
        question18 += "        static int sum = 0;\n";
        question18 += "        static void add() { sum++; }\n";
        question18 += "        public static void main(String[] args) {\n";
        question18 += "            for (int i = 0; i < 10; i++) add();\n";
        question18 += "            System.out.println(sum);\n";
        question18 += "        }\n";
        question18 += "    }\n";

        question18 += "\n";
        question18 += "A. 0\n";
        question18 += "B. 9\n";
        question18 += "C. 10\n";
        question18 += "D. 45\n";
        question18 += "E. 100\n";

        String question19 = "Consider the following Java method, which term best describes \"\'(\"Hello, World!\")\"?\n";

        question19 += "\n";
        question19 += "    public static void main(String[] args) {\n";
        question19 += "        System.out.println(\"Hello, World!\");\n";
        question19 += "    }\n";

        question19 += "\n";
        question19 += "A. Actual parameter or argument\n";
        question19 += "B. Formal parameter\n";
        question19 += "C. Method call\n";
        question19 += "D. Modifier\n";
        question19 += "E. Return type\n";

        String question20 = "What is output by the following Java program?\n";

        question20 += "\n";
        question20 += "Zap {\n";
        question20 += "    static boolean zap() { return true; }\n";
        question20 += "    static int zap(boolean x) { return 0; }\n";
        question20 += "    static double zap(int x) { return 0.5; }\n";
        question20 += "    static String zap(double x) { return \"Zap!\"; }\n";
        question20 += "    static boolean zap(String x) { return false; }\n";
        question20 += "    public static void main(String[] args) {\n";
        question20 += "        System.out.println(zap(zap(zap(zap(1)))));\n";
        question20 += "    }\n";
        question20 += "}\n";

        question20 += "\n";
        question20 += "A. true\n";
        question20 += "B. 0\n";
        question20 += "C. 0.5\n";
        question20 += "D. Zap!\n";
        question20 += "E. false\n";



        check(question1, "B");
        check(question2, "D");
        check(question3, "E");
        check(question4, "A");
        check(question5, "C");
        check(question6, "D");
        check(question7, "B");
        check(question8, "D");
        check(question9, "B");
        check(question10,"A");
        check(question11,"D");
        check(question12,"C");
        check(question13,"A");
        check(question14,"B");
        check(question15,"D");
        check(question16,"E");
        check(question17,"C");
        check(question18,"C"); 
        check(question19,"A"); 
        check(question20,"B"); 




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