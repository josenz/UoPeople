public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "What is the output of the following Java program?\n";
        headQuestion0 += "\n";

        headQuestion0 += "class Food {\n";
        headQuestion0 += "    String flavor = \"bland\";\n";
        headQuestion0 += "    void printFlavor() { System.out.println(flavor); }\n";
        headQuestion0 += "}\n";
        headQuestion0 += "class Pepper extends Food {\n";
        headQuestion0 += "    String flavor = \"spicy\";\n";
        headQuestion0 += "    void printFlavor() { System.out.println(flavor); }\n";
        headQuestion0 += "}\n";
        headQuestion0 += "public class Lunch {\n";
        headQuestion0 += "        public static void main(String[] args) {\n";
        headQuestion0 += "            Food lunch = new Pepper();\n";
        headQuestion0 += "            lunch.printFlavor();\n";
        headQuestion0 += "        }\n";
        headQuestion0 += "}\n";

        Question question = new MultipleChoiceQuestion(headQuestion0, "bland", "bland \n spicy", 
                                      "no output", "spicy", "the program does not compile.","d");
        question.check();

        String headQuestion1 = "What is the output of the following Java program?\n";
        headQuestion1 += "\n";

        headQuestion1 += "class Food {\n";
        headQuestion1 += "    String flavor = \"bland\";\n";
        headQuestion1 += "}\n";
        headQuestion1 += "class Pepper extends Food {\n";
        headQuestion1 += "    String flavor = \"spicy\";\n";
        headQuestion1 += "}\n";
        headQuestion1 += "public class Lunch {\n";
        headQuestion1 += "        public static void main(String[] args) {\n";
        headQuestion1 += "            Pepper lunch = new Pepper();\n";
        headQuestion1 += "            System.out.println(lunch.flavor);\n";
        headQuestion1 += "        }\n";
        headQuestion1 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion1, "bland", "bland \n spicy", 
                                      "no output", "spicy", "the program does not compile.", "d");
        question.check();

        String headQuestion2 = "What is the output of the following Java program?\n";
        headQuestion2 += "\n";

        headQuestion2 += "class Food {\n";
        headQuestion2 += "    Food() { System.out.println(\"bland\"); }\n";
        headQuestion2 += "}\n";
        headQuestion2 += "class Pepper extends Food {\n";
        headQuestion2 += "    Pepper() { System.out.println(\"spicy\"); }\n";
        headQuestion2 += "}\n";
        headQuestion2 += "public class Lunch {\n";
        headQuestion2 += "        public static void main(String[] args) {\n";
        headQuestion2 += "            Food lunch = new Pepper();\n";
        headQuestion2 += "        }\n";
        headQuestion2 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion2, "bland", "bland \n spicy", "no output", "spicy",
                        "the program does not compile.", "b");
        question.check();

        String headQuestion3 = "What is the output of the following Java program?\n";
        headQuestion3 += "\n";

        headQuestion3 += "abstract class Food {\n";
        headQuestion3 += "    abstract void printFlavor();\n";
        headQuestion3 += "}\n";
        headQuestion3 += "class Pepper extends Food {\n";
        headQuestion3 += "    void printFlavor() { System.out.println(\"spicy\"); }\n";
        headQuestion3 += "}\n";
        headQuestion3 += "public class Lunch {\n";
        headQuestion3 += "        public static void main(String[] args) {\n";
        headQuestion3 += "            Food pepper = new Food();\n";
        headQuestion3 += "            pepper.printFlavor();\n";
        headQuestion3 += "        }\n";
        headQuestion3 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion3, "bland", "bland \n spicy", "no output", "spicy",
                        "the program does not compile.", "e");
        question.check();

        String headQuestion4 = "A subclass will _____ one superclass.\n";

        headQuestion4 += "\n";

        question = new MultipleChoiceQuestion(headQuestion4, "abstract", "extend",
                "implement", " inherit", "override", "b");
        question.check();

        String headQuestion5 = "Which one of the following Java technologies eliminates memory leaks?\n";

        question = new MultipleChoiceQuestion(headQuestion5, "garbage collection", " just-in-time compilers",
                "object-oriented analysis and design", "software engineering", "virtual machines", "a");
        question.check();

        String headQuestion6 = "Which one of the following claims about Java is INCORRECT?\n";

        question = new MultipleChoiceQuestion(headQuestion6, "A class is a type.", "An object belongs to a class.",
                "An object is an instance of a class.", "An object is a type.", "\"Object\"is a class.", "d");
        question.check();


        String headQuestion7 = "Do you want to be a Software Engineer?\n";
        question = new TrueFalseQuestion(headQuestion7, "TRUE");
        question.check();

        String headQuestion8 = "Are you a sad person?\n";
        question = new TrueFalseQuestion(headQuestion8, "FALSE");
        question.check();

        String headQuestion9 = "Do you hate Java?\n";
        question = new TrueFalseQuestion(headQuestion9, "FALSE");
        question.check();

        String headQuestion10 = "Is it fun learning computer languages?\n";
        question = new TrueFalseQuestion(headQuestion10, "TRUE");
        question.check();

        String headQuestion11 = "Do you want to learn more about Java?\n";
        question = new TrueFalseQuestion(headQuestion11, "TRUE");
        question.check();

        String headQuestion12 = "What is the output of the following Java program?\n";
        headQuestion12 += "\n";

        headQuestion12 += "class Food {\n";
        headQuestion12 += "    String flavor = \"bland\";\n";
        headQuestion12 += "    void printFlavor() { System.out.println(flavor); }\n";
        headQuestion12 += "}\n";
        headQuestion12 += "class Pepper extends Food {\n";
        headQuestion12 += "    String flavor = \"spicy\";\n";
        headQuestion12 += "    void printFlavor() { System.out.println(flavor); }\n";
        headQuestion12 += "}\n";
        headQuestion12 += "public class Lunch {\n";
        headQuestion12 += "        public static void main(String[] args) {\n";
        headQuestion12 += "            Food lunch = new Pepper();\n";
        headQuestion12 += "            lunch.printFlavor();\n";
        headQuestion12 += "        }\n";
        headQuestion12 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion12, "bland", "bland \n spicy", "no output", "spicy",
                        "the program does not compile.", "d");
        question.check();


        String headQuestion13 = "What is the output of the following Java program?\n";
        headQuestion13 += "\n";

        headQuestion13 += "class Food {\n";
        headQuestion13 += "    Food() { printFlavor(); }\n";
        headQuestion13 += "    void printFlavor() { System.out.println(\"bland\"); }\n";
        headQuestion13 += "}\n";
        headQuestion13 += "class Pepper extends Food {\n";
        headQuestion13 += "    void printFlavor() { System.out.println(\"spicy\"); }\n";
        headQuestion13 += "}\n";
        headQuestion13 += "public class Lunch {\n";
        headQuestion13 += "        public static void main(String[] args) {\n";
        headQuestion13 += "            Food lunch = new Pepper();\n";
        headQuestion13 += "        }\n";
        headQuestion13 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion13, "bland", "bland \n spicy", "no output", "spicy",
                        "the program does not compile.", "d");
        question.check();


        Question.showResults();
    }

}