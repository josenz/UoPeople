
public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "What is the output of the following Java program?\n";
        headQuestion0 += "\n";

        headQuestion0 += "public class Food {\n";
        headQuestion0 += "    static int count;\n";
        headQuestion0 += "    private String flavour = \"sweet\";\n";
        headQuestion0 += "    Food(String s) { flavor = s; }\n";
        headQuestion0 += "    void setFlavor(String s) { flavor = s; }\n";
        headQuestion0 += "    String getFlavor() { return flavor; }\n";
        headQuestion0 += "    static public void main(String[] args) {\n";
        headQuestion0 += "        Food pepper = new Food(\"spicy\");\n";
        headQuestion0 += "        Food chile = pepper;\n";
        headQuestion0 += "        pepper.setFlavor(\"smoky\");\n";
        headQuestion0 += "        System.out.println(pepper == chile);\n";
        headQuestion0 += "    }\n";
        headQuestion0 += "}\n";
        headQuestion0 += "\n";

        MultipleChoiceQuestion question = new MultipleChoiceQuestion(headQuestion0, "true", "false", 
                                                                        "smoky", "spicy", "sweet.","a");
        question.check();

        String headQuestion1 = "Which one of the following values can a Java variable NOT have?\n";

        headQuestion1 += "\n";

        question = new MultipleChoiceQuestion(headQuestion1, "a floating-point number", "an integer",
                                                    "an object", "the memory location of an object",
                                                    "true or false", "c");
        question.check();

        String headQuestion2 = "What is the output of the following Java program?\n";

        headQuestion2 += "\n";
        headQuestion2 += "public class Food {\n";
        headQuestion2 += "    static int count;\n";
        headQuestion2 += "    private String flavor = \"sweet\";\n";
        headQuestion2 += "    Food(String s) { flavor = s; }\n";
        headQuestion2 += "    void setFlavor(String s) { flavor = s; }\n";
        headQuestion2 += "    String getFlavor() { return flavor; }\n";
        headQuestion2 += "    static public void main(String[] args) {\n";
        headQuestion2 += "        Food pepper = new Food();\n";
        headQuestion2 += "        System.out.println(pepper.getFlavor());\n";
        headQuestion2 += "    }\n";
        headQuestion2 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion2, "1", "2", "spicy","sweet", 
                                                                "The program does not compile", "e");
        question.check();

        String headQuestion3 = "Consider the following Java program, which one of" +
                                                " the following best describes \"setFlavor\"?\n";

        headQuestion3 += "\n";
        headQuestion3 += "public class Food {\n";
        headQuestion3 += "    static int count;\n";
        headQuestion3 += "    private String flavor = \"sweet\";\n";
        headQuestion3 += "    Food() { count++; }\n";
        headQuestion3 += "    void setFlavor(String s) { flavor = s; }\n";
        headQuestion3 += "    String getFlavor() { return flavor; }\n";
        headQuestion3 += "    static public void main(String[] args) {\n";
        headQuestion3 += "        Food pepper = new Food();\n";
        headQuestion3 += "        System.out.println(pepper.getFlavor());\n";
        headQuestion3 += "    }\n";
        headQuestion3 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion3, "a class variable", "a constructor",
                                                     "a local object variable", "an instance variable", 
                                                     "a method", "e");
        question.check();

        String headQuestion4 = "Consider the following Java program, which one of the" + 
                                                    " following best describes \"count\"?\n";

        headQuestion4 += "\n";
        headQuestion4 += "public class Food {\n";
        headQuestion4 += "    static int count;\n";
        headQuestion4 += "    private String flavor = \"sweet\";\n";
        headQuestion4 += "    Food() { count++; }\n";
        headQuestion4 += "    void setFlavor(String s) { flavor = s; }\n";
        headQuestion4 += "    String getFlavor() { return flavor; }\n";
        headQuestion4 += "    static public void main(String[] args) {\n";
        headQuestion4 += "        Food pepper = new Food();\n";
        headQuestion4 += "        System.out.println(pepper.getFlavor());x\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion4, "a class variable", "a constructor",
                "a local object variable", "an instance variable", "a method", "a");
        question.check();

        String headQuestion5 = "Which one of the following Java technologies eliminates memory leaks?\n";

        question = new MultipleChoiceQuestion(headQuestion5, "garbage collection", " just-in-time compilers",
                "object-oriented analysis and design", "software engineering", "virtual machines", "a");
        question.check();

        String headQuestion6 = "Which one of the following claims about Java is INCORRECT?\n";

        question = new MultipleChoiceQuestion(headQuestion6, "A class is a type.", "An object belongs to a class.",
                "An object is an instance of a class.", "An object is a type.", "\"Object\"is a class.", "d");
        question.check();


        question.showResults();
    }

}