public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "What are two parts to recursion?\n";
        headQuestion0 += "\n";

        headQuestion0 += "a. (1) If the problem is easy, solve it immediately, and (2) If the problem can't be solved immediately, divide it into smaller problems.\n";
        headQuestion0 += "b. (1) Divide the problem into smaller problems, and (2) give immediate solutions for the hard problems.\n";
        headQuestion0 += "c. (1) Discard the hard cases , and (2) solve the easy easy cases.\n";
        headQuestion0 += "d. (1) Solve the problem by asking it to solve itself, (2) Solve the easy cases in one step.\n";

        headQuestion0 += "\n";
        headQuestion0 += "Select one:\n";

        Question question = new MultipleChoiceQuestion(headQuestion0, "A", "B", 
                                      "C", "D", "E","a");
        question.check();

        String headQuestion1 = "How can you drink an entire keg of root beer?\n";
        headQuestion1 += "\n";

        headQuestion1 += "a. (1) take one swallow, then (2) take another swallow.\n";
        headQuestion1 += "b. (1) If the keg is empty do nothing, otherwise (2) take one swallow, then drink the rest of the keg.\n";
        headQuestion1 += "c. (1) take one enormous gulp, and (2) wish you hadn't.\n";
        headQuestion1 += "d. (1) drink one keg, and (2) drink another keg.\n";
        headQuestion1 += "e. None of them.\n";

        headQuestion1 += "\n";
        headQuestion1 += "Select one:\n";

        question = new MultipleChoiceQuestion(headQuestion1, "A", "B", 
                                      "C", "D", "E", "b");
        question.check();

        String headQuestion2 = "How do you study a text book?\n";
        headQuestion2 += "\n";

        headQuestion2 += "a. (1) Read the book on day 1, and (2) read it again each day of the semester.\n";
        headQuestion2 += "b. (1) If you have reached the end of the book you are done, else (2) study one page, then study the rest of the book.\n";
        headQuestion2 += "c. (1) Divide the book in two, and (2) study each half.\n";
        headQuestion2 += "d. (1) Cram all the pages in one horrible session, and (2) forget everything the next night.\n";
        headQuestion2 += "e. None of them.\n";
        headQuestion2 += "\n";

        headQuestion2 += "\n";


        question = new MultipleChoiceQuestion(headQuestion2, "a", "b", "c", "d",
                        "e", "b");
        question.check();


        String headQuestion4 = "Which answer is a correct skeleton for a recursive Java method?\n";

        headQuestion4 += "\n";

        headQuestion4 += "A. \n";
        headQuestion4 += "int solution( int N )\n";
        headQuestion4 += "{\n";
        headQuestion4 += "    if ( base case )\n";
        headQuestion4 += "    {\n";
        headQuestion4 += "        return something easily computed\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "    else\n";
        headQuestion4 += "    {\n";
        headQuestion4 += "        divide problem into pieces\n";
        headQuestion4 += "        return something calculated from the solution to each piece \n";
        headQuestion4 += "    }\n";
        headQuestion4 += "}\n";
        headQuestion4 += "\n";

        headQuestion4 += "B. \n";
        headQuestion4 += "int solution( int N )\n";
        headQuestion4 += "{\n";
        headQuestion4 += "    if ( base case )\n";
        headQuestion4 += "    {\n";
        headQuestion4 += "        return something easily computed\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "    else\n";
        headQuestion4 += "    {\n";
        headQuestion4 += "        return solution(N)\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "}\n";
        headQuestion4 += "\n";

        headQuestion4 += "C. \n";
        headQuestion4 += "int solution( int N )\n";
        headQuestion4 += "{\n";
        headQuestion4 += "    divide problem into pieces\n";
        headQuestion4 += "    return something calculated from the solution to each piece\n";
        headQuestion4 += "}\n";
        headQuestion4 += "\n";

        headQuestion4 += "D. \n";
        headQuestion4 += "int solution( int N )\n";
        headQuestion4 += "{\n";
        headQuestion4 += "    divide problem into pieces\n";
        headQuestion4 += "    if ( base case )\n";
        headQuestion4 += "    {\n";
        headQuestion4 += "        return something easily computed\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "    else\n";
        headQuestion4 += "    {\n";
        headQuestion4 += "         return something calculated from the solution to each piece\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "}\n";
        headQuestion4 += "\n";

        headQuestion4 += "E. \n";
        headQuestion4 += "int solution( int N )\n";
        headQuestion4 += "{\n";
        headQuestion4 += "  Nothing  ";
        headQuestion4 += "}\n";
        headQuestion4 += "\n";

        question = new MultipleChoiceQuestion(headQuestion4, "A", "B",
                "C", "D", "E", "a");
        question.check();

        String headQuestion5 = "Which of the following statements are true?\n";

        headQuestion5 += "\n";
        headQuestion5 += "a. The Fibonacci series begins with 0 and 1, and each subsequent number is the sum of the preceding two numbers in the series.\n";
        headQuestion5 += "b. The Fibonacci series begins with 1 and 1, and each subsequent number is the sum of the preceding two numbers in the series.\n";
        headQuestion5 += "c. The Fibonacci series begins with 1 and 2, and each subsequent number is the sum of the preceding two numbers in the series.\n";
        headQuestion5 += "d. The Fibonacci series begins with 2 and 3, and each subsequent number is the sum of the preceding two numbers in the series.\n";
        headQuestion5 += "e. None of them.\n";
        headQuestion5 += "\n";

        question = new MultipleChoiceQuestion(headQuestion5, "a", "b",
                "c", "d", "e", "a");
        question.check();

        String headQuestion7 = "In the following method, what is the base case?\n";
        headQuestion7 += "\n";

        headQuestion7 += "static int xMethod(int n) {\n";
        headQuestion7 += "    if (n == 1)\n";
        headQuestion7 += "        return 1;\n";
        headQuestion7 += "    else\n";
        headQuestion7 += "        return n + xMethod(n -1);\n";
        headQuestion7 += "}\n";
        headQuestion7 += "\n";

        headQuestion7 += "Select one:\n";
        headQuestion7 += "\n";

        headQuestion7 += "a. n is 1\n";
        headQuestion7 += "b. n is greater than 1.\n";
        headQuestion7 += "c. n is less than 1.\n";
        headQuestion7 += "d. no base case.\n";
        headQuestion7 += "e. none of them.\n";
        

        question = new MultipleChoiceQuestion(headQuestion7, "a", "b", "c", "d", "e", "a");
        question.check();

        String headQuestion8 = "Consider the following two programs:\n";
        headQuestion8 += "\n";

        headQuestion8 += "A.\n";
        headQuestion8 += "public class Test { \n";
        headQuestion8 += "    public static void main(String[] args) { \n";
        headQuestion8 += "        xMethod(5); \n";
        headQuestion8 += "    } \n";
        headQuestion8 += "\n";

        headQuestion8 += "    public static void xMethod(int length) { \n";
        headQuestion8 += "         if (length > 1) {\n";
        headQuestion8 += "             System.out.print((length - 1) + \" \");\n";
        headQuestion8 += "             xMethod(length - 1);\n";
        headQuestion8 += "         }\n";
        headQuestion8 += "    }\n";
        headQuestion8 += "}\n";
        headQuestion8 += "\n";

        headQuestion8 += "B.\n";
        headQuestion8 += "public class Test { \n";
        headQuestion8 += "    public static void main(String[] args) { \n";
        headQuestion8 += "        xMethod(5); \n";
        headQuestion8 += "    } \n";
        headQuestion8 += "\n";

        headQuestion8 += "    public static void xMethod(int length) { \n";
        headQuestion8 += "         while (length > 1) {\n";
        headQuestion8 += "             System.out.print((length - 1) + \" \");\n";
        headQuestion8 += "             xMethod(length - 1);\n";
        headQuestion8 += "         }\n";
        headQuestion8 += "    }\n";
        headQuestion8 += "}\n";
        headQuestion8 += "\n";

        headQuestion8 += "Select one:\n";
        headQuestion8 += "\n";

        headQuestion8 += "a. The two programs produce the same output 5 4 3 2 1.\n";
        headQuestion8 += "b. The two programs produce the same output 1 2 3 4 5.\n";
        headQuestion8 += "c. The two programs produce the same output 4 3 2 1.\n";
        headQuestion8 += "d. The two programs produce the same output 1 2 3 4.\n";
        headQuestion8 += "e. Program A produces the output 4 3 2 1 and Program B prints 4 3 2 1 1 1 .... 1 infinitely\n";

        question = new MultipleChoiceQuestion(headQuestion8, "a", "b", "c", "d", "e", "e");
        question.check();

        String headQuestion9 = "What code is missing to complete the following method for sorting a list?\n";
        headQuestion9 += "\n";

        headQuestion9 += "public static void sort(double[] list) {\n";
        headQuestion9 += "___________________________;\n";
        headQuestion9 += "}\n";
        headQuestion9 += "\n";

        headQuestion9 += "public static void sort(double[] list, int high) {\n";
        headQuestion9 += "    if (high > 1) {\n";
        headQuestion9 += "        // Find the largest number and its index\n";
        headQuestion9 += "        int indexOfMax = 0;\n";
        headQuestion9 += "        double max = list[0];\n";
        headQuestion9 += "        for (int i = 1; i <= high; i++) {\n";
        headQuestion9 += "             if (list[i] > max) {\n";
        headQuestion9 += "                 max = list[i];\n";
        headQuestion9 += "                 indexOfMax = i;\n";
        headQuestion9 += "             }\n";
        headQuestion9 += "        }\n";
        headQuestion9 += "\n";

        headQuestion9 += "    // Swap the largest with the last number in the list\n";
        headQuestion9 += "    list[indexOfMax] = list[high];\n";
        headQuestion9 += "    list[high] = max;\n";
        headQuestion9 += "\n";

        headQuestion9 += "    // Sort the remaining list\n";
        headQuestion9 += "    sort(list, high - 1);\n";
        headQuestion9 += "    }\n";
        headQuestion9 += "}\n";
        headQuestion9 += "\n";

        headQuestion9 += "Select one:\n";
        headQuestion9 += "\n";

        headQuestion9 += "a. sort(list)\n";
        headQuestion9 += "b. sort(list, list.length)\n";
        headQuestion9 += "c. sort(list, list.length - 1)\n";
        headQuestion9 += "d. sort(list, list.length - 2)\n";
        headQuestion9 += "e. None of them.\n";

        question = new MultipleChoiceQuestion(headQuestion9, "a", "b", "c", "d", "e", "c");
        question.check();


        String headQuestion10 = "For a linked list to be used in a program, that program needs:\n";
        headQuestion10 += "\n";

        headQuestion10 += "i. A variable that refers to the first node in the list. \n";
        headQuestion10 += "ii. A pointer to the first node. \n";
        headQuestion10 += "iii. A null pointer in the last node. \n";
        headQuestion10 += " \n";

        headQuestion10 += "Select one:\n";
        

        headQuestion10 += "a. i and ii\n";
        headQuestion10 += "b. i\n";
        headQuestion10 += "c. ii and iii\n";
        headQuestion10 += "d. i, ii and iii\n";
        headQuestion10 += "e. None of them.\n";

        question = new MultipleChoiceQuestion(headQuestion10, "a", "b", "c", "d", "e", "d");
        question.check();

        String headQuestion11 = "Suppose cursor refers to a node in a linked list (using the IntNode class with\n"; 
        headQuestion11 += "instance variables called data and link). What statement changes cursor so that it refers to the next node?\n";
        headQuestion11 += "\n";

        headQuestion11 += "Select one:\n";
        headQuestion11 += "\n";

        headQuestion11 += "a. cursor++;\n";
        headQuestion11 += "b. cursor = link;\n";
        headQuestion11 += "c. cursor += link;\n";
        headQuestion11 += "d. cursor = cursor.link;\n";
        headQuestion11 += "e. None of them.\n";

        question = new MultipleChoiceQuestion(headQuestion11, "a", "b", "c", "d", "e", "d");
        question.check();

        Question.showResults();
    }

}