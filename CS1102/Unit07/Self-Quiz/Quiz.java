public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "Consider the following Java method. Which term best describes what this method computes?\n";
        headQuestion0 += "\n";

        headQuestion0 += "static void doSomething(int[][] a) {\n";
        headQuestion0 += "    int n = a.length;\n";
        headQuestion0 += "    for (int j = 0; j < n; j++) {\n";
        headQuestion0 += "        for (int i = j+1; i < n; i++) {\n";
        headQuestion0 += "            int aij = a[i][j];\n";
        headQuestion0 += "            a[i][j] = a[j][i];\n";
        headQuestion0 += "            a[j][i] = aij;\n";
        headQuestion0 += "        }\n";
        headQuestion0 += "    }\n";
        headQuestion0 += "}\n";


        Question question = new MultipleChoiceQuestion(headQuestion0, "average", "maximum", 
                                      "minimum", "sum", "transpose", "e");
        question.check();

        String headQuestion1 = "What is the output of the following Java program?\n";
        headQuestion1 += "\n";

        headQuestion1 += "import java.util.*;\n";
        headQuestion1 += "class ArrayGames {\n";
        headQuestion1 += "    public static void main(String[] args) {\n";
        headQuestion1 += "        int[] a = {1,2,3,4,5};\n";
        headQuestion1 += "        for (int i = 0; i < a.length; i++) a[i] = a[i-1];\n";
        headQuestion1 += "        System.out.println(Arrays.toString(a));\n";
        headQuestion1 += "    }\n";
        headQuestion1 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion1, "[0, 1, 2, 3, 4]", "[1, 1, 1, 1, 1]", 
                                      "[1, 2, 3, 4, 5]", "[1, 4, 9, 16, 25]", "No output. It throws an exception.", "e");
        question.check();


        String headQuestion2 = "What is the output of the following Java program?\n";
        headQuestion2 += "\n";

        headQuestion2 += "import java.util.*;\n";
        headQuestion2 += "class ArrayGames {\n";
        headQuestion2 += "    public static void main(String[] args) {\n";
        headQuestion2 += "        int[] a = {1,2,3,4,5};\n";
        headQuestion2 += "        for (int i = 0; i < a.length; i++) a[i] *= a[i];\n";
        headQuestion2 += "        System.out.println(Arrays.toString(a));\n";
        headQuestion2 += "    }\n";
        headQuestion2 += "}\n";


        question = new MultipleChoiceQuestion(headQuestion2, "[0, 1, 2, 3, 4]", "[1, 1, 1, 1, 1]", "[1, 2, 3, 4, 5]",
                        " [1, 4, 9, 16, 25]", "No output. It throws an exception.", "d");
        question.check();


        String headQuestion3 = "What is the output of the following Java program?\n";
        headQuestion3 += "\n";

        headQuestion3 += "import java.util.*;\n";
        headQuestion3 += "class ArrayGames {\n";
        headQuestion3 += "    public static void main(String[] args) {\n";
        headQuestion3 += "        int[] a = {1,2,3,4,5};\n";
        headQuestion3 += "        for (int c : a) c *= c;\n";
        headQuestion3 += "        System.out.println(Arrays.toString(a));\n";
        headQuestion3 += "    }\n";
        headQuestion3 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion3, " [0, 1, 2, 3, 4];", "[1, 1, 1, 1, 1]", 
                                "[1, 2, 3, 4, 5] ", "[1, 4, 9, 16, 25]","No output. It throws an exception.", "c");
        question.check();


        String headQuestion4 = "What is the output of the following Java program?\n";
        headQuestion4 += "\n";

        headQuestion4 += "import java.util.*;\n";
        headQuestion4 += "class ArrayGames {\n";
        headQuestion4 += "    public static void main(String[] args) {\n";
        headQuestion4 += "        Integer[] a = new Integer[5];\n";
        headQuestion4 += "        System.out.println(Arrays.toString(a));\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion4, "null", "[0, 0, 0, 0, 0]", "[5, 5, 5, 5, 5]", 
                                                    "[null, null, null, null, null]", "No output. It throws an exception", "d");
        question.check();


        String headQuestion5 = "Consider the following Java method. Which term best describes what this method computes?\n";
        headQuestion5 += "\n";

        headQuestion5 += "static int doSomething(int[] a) {\n";
        headQuestion5 += "    int b = a[0];\n";
        headQuestion5 += "    for (int c : a) if (b > c) b = c;\n";
        headQuestion5 += "    return b;\n";
        headQuestion5 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion5, "average", "maximum", "minimum",
                "sum", "transpose", "c");
        question.check();

        String headQuestion6 = "Which one of the following does NOT describe an ArrayList?\n";
        headQuestion6 += "\n";

        question = new MultipleChoiceQuestion(headQuestion6, "It can be used in a for-each loop.", 
                    "It has a numbered sequence of elements.", "It provides efficient random access to its elements.", 
                    "Its elements can be a primitive type.", "The number of its elements can change.", "d");
        question.check();



        String headQuestion7 = "Consider the following Java method. Which term best describes what this method computes?\n";
        headQuestion7 += "\n";

        headQuestion7 += "static double doSomething(int[] a) {\n";
        headQuestion7 += "    int b = 0;\n";
        headQuestion7 += "    for (int c : a) b += c;\n";
        headQuestion7 += "    return (double)b/ (double)a.length;\n";
        headQuestion7 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion7, "average",
                "maximum", "minimum", "sum", "transpose", "a");
        question.check();
        
        String headQuestion8 = "What is the output of the following Java program?\n";
        headQuestion8 += "\n";

        headQuestion8 += "import java.util.*\n";
        headQuestion8 += "class ArrayGames {\n";
        headQuestion8 += "    public static void main(String[] args) {\n";
        headQuestion8 += "        ArrayList<Integer> a = new ArrayList<Integer>();\n";
        headQuestion8 += "        for (int i = 1; i <= 5; i++) a.add(i)\n";
        headQuestion8 += "        int n = 3;\n";
        headQuestion8 += "        a.remove(n);\n";
        headQuestion8 += "        System.out.println(a.toString());\n";
        headQuestion8 += "    }\n";
        headQuestion8 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion8, "[0, 1, 2, 4, 5]", "[1, 2, 3, 4, 5]", "[1, 2, 3, 5]", 
                                                                " [1, 2, 4, 5]", "[4, 5]", "c");
        question.check();

        String headQuestion9 = "What is the output of the following Java program?\n";
        headQuestion9 += "\n";

        headQuestion9 += "static int doSomething(int[] a) {\n";
        headQuestion9 += "    int b = 0;\n";
        headQuestion9 += "    for (int c : a) b += c;\n";
        headQuestion9 += "    return b;\n";
        headQuestion9 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion9, "average", "maximum", "minimum",
                "sum", "transpose", "d");
        question.check();


        String headQuestion10 = "What is the output of the following Java program?\n";
        headQuestion10 += "\n";

        headQuestion10 += "import java.util.*;\n";
        headQuestion10 += "class ArrayGames {\n";
        headQuestion10 += "    public static void main(String[] args) {\n";
        headQuestion10 += "        ArrayList<Integer> a = new ArrayList<Integer>();\n";
        headQuestion10 += "        for (int i = 0; i < 5; i++) a.add(i);\n";
        headQuestion10 += "        System.out.println(a.toString());\n";
        headQuestion10 += "    }\n";
        headQuestion10 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion10, " [0, 1, 2, 3, 4] ", "[1, 1, 1, 1, 1]", "[1, 2, 3, 4, 5]", 
                                                        "[1, 4, 9, 16, 25]", "No output. It throws an exception.", "a");
        question.check();


        String headQuestion11 = "What is the output of the following Java program?\n";
        headQuestion11 += "\n";

        headQuestion11 += "import java.util.*;\n";
        headQuestion11 += "class ArrayGames {\n";
        headQuestion11 += "    public static void main(String[] args) {\n";
        headQuestion11 += "        ArrayList<Integer> a = new ArrayList<Integer>();\n";
        headQuestion11 += "        for (int i = 0; i < 5; i++) a.add(i);\n";
        headQuestion11 += "        Integer n = 3;\n";
        headQuestion11 += "        a.remove(n);\n";
        headQuestion11 += "        System.out.println(a.toString());\n";
        headQuestion11 += "    }\n";
        headQuestion11 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion11, "[0, 1, 2, 4, 5]", "[1, 2, 3, 4, 5]", "[1, 2, 3, 5]",
                "[1, 2, 4, 5]", "[4, 5]", "d");
        question.check();


        String headQuestion12 = "What is the output of the following Java program?\n";
        headQuestion12 += "\n";

        headQuestion12 += "import java.util.*;\n";
        headQuestion12 += "class ArrayGames {\n";
        headQuestion12 += "    public static void main(String[] args) {\n";
        headQuestion12 += "        int[] a = {1,2,3,4,5};\n";
        headQuestion12 += "        for (int i = 1; i < a.length; i++) a[i] = a[i-1];\n";
        headQuestion12 += "        System.out.println(Arrays.toString(a));\n";
        headQuestion12 += "    }\n";
        headQuestion12 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion12, "[0, 1, 2, 3, 4]", "[1, 1, 1, 1, 1]", "[1, 2, 3, 4, 5]",
                "[1, 4, 9, 16, 25]", "No output. It throws an exception.", "b");
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