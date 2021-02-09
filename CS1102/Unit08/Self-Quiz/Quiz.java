public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "In a for loop, how many times does the continuation condition run?\n";
        headQuestion0 += "\n";

        Question question = new MultipleChoiceQuestion(headQuestion0, "At least once, at the beginning of each iteration.", 
                                "At least once, at the end of each iteration.", "Exactly once.", "Zero or more times, at the beginning of each iteration.", 
                                "Zero or more times, at the end of each iteration.", "a");
        question.check();

        String headQuestion1 = "Consider the following line of Java code.\n";
        headQuestion1 += "\n";

        headQuestion1 += "System.out.println(\"Hello, World!\");\n";
        headQuestion1 += "\n";
        headQuestion1 += "The full line of code is which of the following?\n";

        question = new MultipleChoiceQuestion(headQuestion1, "a class", "a method (subroutine)", 
                                      "an object", "a parameter", "a statement", "e");
        question.check();


        String headQuestion2 = "Consider the following Java program, what starts on line 4?\n";
        headQuestion2 += "\n";

        headQuestion2 += "1 public class HelloWorld {\n";
        headQuestion2 += "2     // My first program!\n";
        headQuestion2 += "3     public static void main(String[] args) {\n";
        headQuestion2 += "4         System.out.println(\"Hello, World!\");\n";
        headQuestion2 += "5     }\n";
        headQuestion2 += "6 }\n";


        question = new MultipleChoiceQuestion(headQuestion2, "a variable declaration", "a statement", "a method (subroutine) definition",
                        "a comment", "a class definition", "b");
        question.check();


        String headQuestion3 = "Consider the following Java statements.\n";
        headQuestion3 += "\n";

        headQuestion3 += "int x = 3;\n";
        headQuestion3 += "x = x++;\n";
        headQuestion3 += "\n";
        headQuestion3 += "What is the value of x after these statements are executed?\n";

        question = new MultipleChoiceQuestion(headQuestion3, "0", "3", 
                                "4 ", "5","The question is moot. The statements have a syntax error.", "b");
        question.check();


        String headQuestion4 = "Which of the following can a class NOT be used for?\n";
        headQuestion4 += "\n";

        question = new MultipleChoiceQuestion(headQuestion4, "a container for static methods (subroutines)", "a container for static variables", 
                                        "a primitive type", "a type for method parameters", "a type for variables", "c");
        question.check();


        String headQuestion5 = "Assume \"test\" is a boolean variable. Which of the following expressions is equivalent to \"test == true\"?\n";
        headQuestion5 += "\n";

        question = new MultipleChoiceQuestion(headQuestion5, "test ", "!test", "test = true", "test.equals(true)", "None of the above", "a");
        question.check();

        String headQuestion6 = " Consider the following block of Java code. How many times will it output \"Hello\"?\n";
        headQuestion6 += "\n";

        headQuestion6 += "for (int i = 1; i < 10; i++)\n";
        headQuestion6 += "{\n";
        headQuestion6 += "    System.out.println(\"Hello\");\n";
        headQuestion6 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion6, "0", "1", "9", "10", "Too many!", "c");
        question.check();



        String headQuestion7 = "Consider the following class definition. Which variables can be used in the missing \"println\" expression on line 20?\n";
        headQuestion7 += "\n";

        headQuestion7 += "1  public class PrintStuff\n";
        headQuestion7 += "2  {";
        headQuestion7 += "3      public static void main()";
        headQuestion7 += "4      {\n";
        headQuestion7 += "6          {\n";
        headQuestion7 += "7              int i = -1;\n";
        headQuestion7 += "8              System.out.println(_____);\n";
        headQuestion7 += "9          }\n";
        headQuestion7 += "10         int j = 1;\n";
        headQuestion7 += "11         for (j = 0; j < 10; j++) {\n";
        headQuestion7 += "12             System.out.println(_____);\n";
        headQuestion7 += "13         }\n";
        headQuestion7 += "14         {\n";
        headQuestion7 += "15             int k;\n";
        headQuestion7 += "16             for (k = 0; k < 10; k++) {\n";
        headQuestion7 += "17                System.out.println(_____);\n";
        headQuestion7 += "18             }\n";
        headQuestion7 += "19         }\n";
        headQuestion7 += "20        System.out.println(_____);\n";
        headQuestion7 += "21     }\n";
        headQuestion7 += "22 }\n";

        question = new MultipleChoiceQuestion(headQuestion7, " Only \"i\"",
                "Only \"j\"", "Only \"k\"", "\"i\" and \"j\"", "\"j\" and \"k\"", "a");
        question.check();
        
        String headQuestion8 = "Which one of the following types are not allowed for the expression in a switch statement?\n";
        headQuestion8 += "\n";

        question = new MultipleChoiceQuestion(headQuestion8, "enum", "float", "int", 
                                                                "long", "String", "b");
        question.check();

        String headQuestion9 = "Which one of the following is used in Java programming to handle asynchronous events?\n";
        headQuestion9 += "\n";

        question = new MultipleChoiceQuestion(headQuestion9, "event handlers", "pragmatics", "protocols",
                "reserved words", "short circuits", "a");
        question.check();


        String headQuestion10 = "Which of the following is NOT a valid identifier in Java?\n";
        headQuestion10 += "\n";

        question = new MultipleChoiceQuestion(headQuestion10, "p", "Public", "public", 
                                                        "public23", "PuBlIc_tWeNtY_3", "c");
        question.check();


        String headQuestion11 = "Which of the following keywords is useful for processing lists of menu options?\n";
        headQuestion11 += "\n";

        question = new MultipleChoiceQuestion(headQuestion11, "break", "continue", "do", "switch", "while", "d");
        question.check();


        String headQuestion12 = "Consider the following Java declaration and assignment statement.\n";
        headQuestion12 += "\n";

        headQuestion12 += "float x = y;\n";
        headQuestion12 += "\n";
        headQuestion12 += "Which one of the following types is \"y\" NOT allowed to be?\n";

        question = new MultipleChoiceQuestion(headQuestion12, "double", "float", "int",
                "long", "short", "a");
        question.check();


        String headQuestion13 = "What is the output of the following Java program?\n";
        headQuestion13 += "\n";

        headQuestion13 += "import java.util.*;\n";
        headQuestion13 += "class ArrayGames {\n";
        headQuestion13 += "    public static void main(String[] args) {\n";
        headQuestion13 += "        int[][] a = {{5,4,3,2,1},{-1,-2,-3,-4,-5}};\n";
        headQuestion13 += "        for (int[] b : a) Arrays.sort(b);\n";
        headQuestion13 += "        for (int[] b : a) System.out.print(Arrays.toString(b));\n";
        headQuestion13 += "    }\n";
        headQuestion13 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion13, "[-5, -4, -3, -2, -1]", "[-5, -4, -3, -2, -1][1, 2, 3, 4, 5]", 
                        "[1, 2, 3, 4, 5]", "[1, 2, 3, 4, 5][-5, -4, -3, -2, -1]", "[5, 4, 3, 2, 1][-1, -2, -3, -4, -5]", "d");
        question.check();


        String headQuestion14 = "Consider the following Java method. Which term best describes what this method computes?\n";
        headQuestion14 += "\n";

        headQuestion14 += "static int doSomething(int[] a) {\n";
        headQuestion14 += "    int b = a[0];\n";
        headQuestion14 += "    for (int c : a) if (b < c) b = c;\n";
        headQuestion14 += "    return b;\n";
        headQuestion14 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion14, "average", "maximum ", "minimum", "sum", "transpose", "b");
        question.check();


        String headQuestion15 = "What is the output of the following Java program?\n";
        headQuestion15 += "\n";

        headQuestion15 += "import java.util.*;\n";
        headQuestion15 += "class ArrayGames {\n";
        headQuestion15 += "    public static void main(String[] args) {\n";
        headQuestion15 += "        int[] a = new int[5];\n";
        headQuestion15 += "        System.out.println(Arrays.toString(a));\n";
        headQuestion15 += "    }\n";
        headQuestion15 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion15, "null", "[0, 0, 0, 0, 0]", "[5, 5, 5, 5, 5]", 
                                    "[null, null, null, null, null]", "No output. It throws an exception.", "b");
        question.check();


        String headQuestion16 = "Which one of the following does NOT describe an array?\n";
        headQuestion16 += "\n";

        question = new MultipleChoiceQuestion(headQuestion16, "It can be used in a for-each loop.", 
            "It has a numbered sequence of elements.", "It provides efficient random access to its elements.", 
            "Its elements can be a primitive type.", "The number of its elements can change.", "e");
        question.check();


        String headQuestion17 = "What is the output of the following Java program?\n";
        headQuestion17 += "\n";

        headQuestion17 += "import java.util.*;\n";
        headQuestion17 += "class ArrayGames {\n";
        headQuestion17 += "    public static void main(String[] args) {\n";
        headQuestion17 += "        ArrayList<Integer> a = new ArrayList<Integer>();\n";
        headQuestion17 += "        for (int i = 1; i <= 5; i++) a.add(i);\n";
        headQuestion17 += "        System.out.println(a.get(a.get(2)));\n";
        headQuestion17 += "    }\n";
        headQuestion17 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion17, "1", "2", "3", "4", "5", "d");
        question.check();


        String headQuestion18 = "What is the output of the following Java program?\n";
        headQuestion18 += "\n";

        headQuestion18 += "import java.util.*;\n";
        headQuestion18 += "class ArrayGames {\n";
        headQuestion18 += "    public static void main(String[] args) {\n";
        headQuestion18 += "        int[] a = {1,2,3,4,5}\n";
        headQuestion18 += "        System.out.println(a[a[1]]);\n";
        headQuestion18 += "    }\n";
        headQuestion18 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion18, "1", "2", "3", "4", "5", "c");
        question.check();


        // String headQuestion = "Do you want to be a Software Engineer?\n";
        // question = new TrueFalseQuestion(headQuestion, "TRUE");
        // question.check();


        String headQuestion19 = "What is the output of the following Java program?\n";
        headQuestion19 += "\n";

        headQuestion19 += "import java.util.*;\n";
        headQuestion19 += "class ArrayGames {\n";
        headQuestion19 += "    public static void main(String[] args) {\n";
        headQuestion19 += "        int[] a = {1,2,3,4,5}\n";
        headQuestion19 += "        System.out.println(a[4]);\n";
        headQuestion19 += "    }\n";
        headQuestion19 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion19, "1", "2", "3", "4", "5", "e");
        question.check();


        Question.showResults();
    }

}