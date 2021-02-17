public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "A switch statement, most often has the form:\n";
        headQuestion0 += "\n";

        headQuestion0 += "switch (expression) {\n";
        headQuestion0 += "    case constant-1:\n";
        headQuestion0 += "        statements-1\n";
        headQuestion0 += "        break;\n";
        headQuestion0 += "        ...\n";
        headQuestion0 += "}\n";

        headQuestion0 += "\n";

        headQuestion0 += "The value of the expression can be:\n";
        headQuestion0 += "\n";

        headQuestion0 += "i. int\n";
        headQuestion0 += "ii. short\n";
        headQuestion0 += "iii. byte\n";
        headQuestion0 += "iv. Primitive char\n";
        headQuestion0 += "v. Enum\n";
        headQuestion0 += "vi. String\n";
        headQuestion0 += "vii. Real number\n";

        headQuestion0 += "\n";
        headQuestion0 += "Select one:\n";

        Question question = new MultipleChoiceQuestion(headQuestion0, "iii , iv and v", "i , ii, iii and iv", 
                                      "All, except vii", "vi and vii", "All of the types listed","c");
        question.check();
        

        String headQuestion1 = "Given the following piece of code:\n";
        headQuestion1 += "\n";

        headQuestion1 += "class CostCalculationException extends Exception{}\n";
        headQuestion1 += "class Item {\n";
        headQuestion1 += "    public void calculateCost() throws CostCalculationException {\n";
        headQuestion1 += "        //...\n";
        headQuestion1 += "        throw new CostCalculationException();\n";
        headQuestion1 += "        //...\n";
        headQuestion1 += "    }\n";
        headQuestion1 += "}\n";
        headQuestion1 += "class Company {\n";
        headQuestion1 += "    public void payCost(){\n";
        headQuestion1 += "        new Item().calculateCost();\n";
        headQuestion1 += "    }\n";
        headQuestion1 += "}\n";

        headQuestion1 += "\n";
        headQuestion1 += "Which of the following statements is correct?\n";
        headQuestion1 += "\n";
        headQuestion1 += "Select one or more:\n";

        question = new MultipleChoiceQuestion(headQuestion1, "This code will compile without any problems.", "This code will compile if in method payCost()you return a boolean instead of void.", 
                                      "This code will compile if you add a try-catch block in payCost()", "This code will compile if you add throws CostCalculationException in the signature of method payCost().", "Don't know!!", "d");
        question.check();

        String headQuestion2 = "Given the following piece of code:\n";
        headQuestion2 += "\n";

        headQuestion2 += "class Student { public void talk(){} }\n";
        headQuestion2 += "public class Test{\n";
        headQuestion2 += "    public static void main(String args[]){\n";
        headQuestion2 += "        Student t = null;\n";
        headQuestion2 += "        try{\n";
        headQuestion2 += "        t.talk();\n";
        headQuestion2 += "        } catch(NullPointerException e){\n";
        headQuestion2 += "            System.out.print(\"There is a NullPointerException. \");\n";
        headQuestion2 += "        } catch(Exception e){\n";
        headQuestion2 += "            System.out.print(\"There is an Exception. \");\n";
        headQuestion2 += "        }\n";
        headQuestion2 += "         System.out.print(\"Everything ran fine. \");\n";
        headQuestion2 += "    }\n";
        headQuestion2 += "}\n";
        
        headQuestion2 += "\n";
        headQuestion2 += "what will be the result?\n";
        headQuestion2 += "\n";

        headQuestion2 += "a. If you run this program, the following is printed:\n";
        headQuestion2 += "There is a NullPointerException. Everything ran fine.\n";
        headQuestion2 += "\n";
        
        headQuestion2 += "b. If you run this program, the following is printed:\n";
        headQuestion2 += "There is a NullPointerException.\n";
        headQuestion2 += "\n";

        headQuestion2 += "c. If you run this program, the following is printed:\n";
        headQuestion2 += "There is a NullPointerException. There is an Exception.\n";
        headQuestion2 += "\n";
        
        headQuestion2 += "d. This code will not compile, because in Java there are no pointers.\n";
        headQuestion2 += "\n";


        question = new MultipleChoiceQuestion(headQuestion2, "a", "b", "c", "d",
                        "Don't know", "a");
        question.check();

        // String headQuestion3 = "Consider the following code (assume that comments are replaced with real code that works as specified): \n";
        // headQuestion3 += "\n";

        // headQuestion3 += "public class TestExceptions {\n";
        // headQuestion3 += "    static void e() {\n";
        // headQuestion3 += "    // Might cause any of the following unchecked exceptions to be\n";
        // headQuestion3 += "    // thrown:\n";
        // headQuestion3 += "    // Ex1, Ex2, Ex3, Ex4\n";
        // headQuestion3 += "    }\n";
        // headQuestion3 += "\n";
        // headQuestion3 += "    static void April() {\n";
        // headQuestion3 += "        try {\n";
        // headQuestion3 += "            e();\n";
        // headQuestion3 += "        } catch (Ex1 ex) {\n";
        // headQuestion3 += "            System.out.println(\"April caught Ex1\");\n";
        // headQuestion3 += "        }\n";
        // headQuestion3 += "    }\n";
        // headQuestion3 += "\n";
        // headQuestion3 += "    static void March() {\n";
        // headQuestion3 += "        try {\n";
        // headQuestion3 += "             April();\n";
        // headQuestion3 += "        } catch (Ex2 ex) {\n";
        // headQuestion3 += "             System.out.println(\"March caught Ex2\");\n";
        // headQuestion3 += "             // now cause exception Ex1 to be thrown\n";
        // headQuestion3 += "        }\n";
        // headQuestion3 += "    }\n";
        // headQuestion3 += "\n";
        // headQuestion3 += "    static void February() {\n";
        // headQuestion3 += "        try {\n";
        // headQuestion3 += "            March();\n";
        // headQuestion3 += "        } catch (Ex1 ex) {\n";
        // headQuestion3 += "            System.out.println(\"February caught Ex1\");\n";
        // headQuestion3 += "        } catch (Ex3 ex) {\n";
        // headQuestion3 += "            System.out.println(\"February caught Ex3\");\n";
        // headQuestion3 += "        }\n";
        // headQuestion3 += "    }\n";
        // headQuestion3 += "\n";
        // headQuestion3 += "    static void January() {\n";
        // headQuestion3 += "        try {\n";
        // headQuestion3 += "            February();\n";
        // headQuestion3 += "        } catch (Ex4 ex) {\n";
        // headQuestion3 += "            System.out.println(\"January caught Ex4\");\n";
        // headQuestion3 += "            // now cause exception Ex1 to be thrown\n";
        // headQuestion3 += "        } catch (Ex1 ex) {\n";
        // headQuestion3 += "            System.out.println(\"January caught Ex1\");\n";
        // headQuestion3 += "        }\n";
        // headQuestion3 += "    }\n";
        // headQuestion3 += "\n";
        // headQuestion3 += "    public static void main(String[] args) {\n";
        // headQuestion3 += "        January();\n";
        // headQuestion3 += "    }\n";
        // headQuestion3 += "}\n";
        // headQuestion3 += "\n";

        // headQuestion3 += "Assume now that this program is run four times. The first time, method e throws exception Ex1, the second time, it throws exception Ex2, etc. \n";
        // headQuestion3 += "What are the results of the four runs (a or b)?\n";
        // headQuestion3 += "\n";

        // headQuestion3 += "a.\n";
        // headQuestion3 += "    1. The program prints:\n";
        // headQuestion3 += "       April caught Ex1\n";
        // headQuestion3 += "    2. The program prints:\n";
        // headQuestion3 += "       March caught Ex2\n";
        // headQuestion3 += "       February caught Ex1\n";
        // headQuestion3 += "    3. The program prints:\n";
        // headQuestion3 += "       February caught Ex3\n";
        // headQuestion3 += "    4. The program prints:\n";
        // headQuestion3 += "       January caught Ex4\n";
        // headQuestion3 += "       And execution stops due to an uncaught exception Ex1 thrown in main()\n";

        // headQuestion3 += "b.\n";
        // headQuestion3 += "    1. The program prints:\n";
        // headQuestion3 += "       April caught Ex3\n";
        // headQuestion3 += "    2. The program prints:\n";
        // headQuestion3 += "       March caught Ex2\n";
        // headQuestion3 += "       February caught Ex2\n";
        // headQuestion3 += "    3. The program prints:\n";
        // headQuestion3 += "       February caught Ex3\n";
        // headQuestion3 += "    4. The program prints:\n";
        // headQuestion3 += "       January caught Ex4\n";
        // headQuestion3 += "       And execution stops due to an uncaught exception Ex1 thrown in main()\n";

        // question = new MultipleChoiceQuestion(headQuestion3, "a", "b", "a and b", "don't know",
        //                 "no idea", "a");
        // question.check();

        String headQuestion4 = "Which statements are correct regarding Java’s predefined class called Throwable?\n";

        headQuestion4 += "\n";

        headQuestion4 += "A - The class Throwable represents all possible objects that can be thrown by a throw statement and caught by a catch clause in a try…catch statement.\n";
        headQuestion4 += "B - The thrown object must belong to the class Throwable or to one of its (many) subclasses such as Exception and RuntimeException.\n";
        headQuestion4 += "C - The object carries information about an exception from the point where the exception occurs to the point where it is caught and handled.\n";
        headQuestion4 += "D - A Throwable contains a snapshot of the execution stack of its thread at the time it was called.\n";
        headQuestion4 += "E - N/A.\n";

        question = new MultipleChoiceQuestion(headQuestion4, "A", "B",
                "C", "D", "E", "a");
        question.check();

        String headQuestion5 = "\"Subclasses of the class Exception which are not subclasses of RuntimeException require mandatory exception handling.\"What are the practical implications of this statement?\n";

        headQuestion5 += "\n";
        headQuestion5 += "a. If a method can throw such an exception, then it must declare this fact by adding a throws clause to the method heading.\n";
        headQuestion5 += "b. If a routine includes any code that can generate such an exception, then the routine must deal with the exception.\n";
        headQuestion5 += "c. The routine cannot handle the exception by adding a throws clause to the method definition.\n";
        headQuestion5 += "d. The routine can handle the exception by including the code in a try statement that has a catch clause to handle the exception.\n";
        headQuestion5 += "\n";

        question = new MultipleChoiceQuestion(headQuestion5, "A", "B",
                "C", "D", "E", "a");
        question.check();

        String headQuestion7 = "The following code writes out the name of a day of the week depending on the value of day. True or False?\n";
        headQuestion7 += "\n";

        headQuestion7 += "String dayName = null;\n";
        headQuestion7 += "switch (day) {\n";
        headQuestion7 += "    case 1:\n";
        headQuestion7 += "    dayName = \"Sunday\";\n";
        headQuestion7 += "    break;\n";
        headQuestion7 += "    case 2:\n";
        headQuestion7 += "    dayName = \"Monday\";\n";
        headQuestion7 += "    break;\n";
        headQuestion7 += "    case 3:\n";
        headQuestion7 += "    dayName = \"Tuesday\";\n";
        headQuestion7 += "    break;\n";
        headQuestion7 += "    case 4:\n";
        headQuestion7 += "    dayName = \"Wednesday\";\n";
        headQuestion7 += "    break;\n";
        headQuestion7 += "    case 5:\n";
        headQuestion7 += "    dayName = \"Thrusday\";\n";
        headQuestion7 += "    break;\n";
        headQuestion7 += "    case 6:\n";
        headQuestion7 += "    dayName = \"Friday\";\n";
        headQuestion7 += "    break;\n";
        headQuestion7 += "    case 7:\n";
        headQuestion7 += "    dayName = \"Saturday\";\n";
        headQuestion7 += "    break;\n";
        headQuestion7 += "}\n";
        headQuestion7 += "System.out.println(dayName)\n";

        question = new TrueFalseQuestion(headQuestion7, "TRUE");
        question.check();

        Question.showResults();
    }

}