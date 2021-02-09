public class Quiz {
    
    public static void main(String[] args) {

        // String headQuestion99 = "What is the output of the following Java program?<br/>";
        // headQuestion99 += "<br/>";

        // headQuestion99 += "class Food {<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp    String flavor = \"bland\";<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp    void printFlavor() { System.out.println(flavor); }<br/>";
        // headQuestion99 += "}<br/>";
        // headQuestion99 += "class Pepper extends Food {<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp    String flavor = \"spicy\";<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp    void printFlavor() { System.out.println(flavor); }<br/>";
        // headQuestion99 += "}<br/>";
        // headQuestion99 += "public class Lunch {<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp        public static void main(String[] args) {<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp            Food lunch = new Pepper();<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp            lunch.printFlavor();<br/>";
        // headQuestion99 += "&nbsp&nbsp&nbsp&nbsp        }<br/>";
        // headQuestion99 += "}<br/>";

        // Question question = new MultipleChoiceQuestion(headQuestion99, "bland", "bland1 spicy", "no output",
        //                 "spicy", "the program does not compile.", "d");
        // question.check();


        String headQuestion0 = "A subclass will _____ one superclass.\n";
        headQuestion0 += "\n";
        Question question = new MultipleChoiceQuestion(headQuestion0, "abstract", "extend", "implement", " inherit", "override",
                "B");
        question.check();

        String headQuestion1 = "Which one of the following is an event handler?\n";
        headQuestion1 += "\n";
        question = new MultipleChoiceQuestion(headQuestion1, "an event generator", "an event listener", 
                                      "an event loop", "an event method", "java.awt.event", "B");
        question.check();

        String headQuestion2 = "Which one of the following Java technologies eliminates memory leaks?\n";
        question = new MultipleChoiceQuestion(headQuestion2, "garbage collection", " just-in-time compilers",
                "object-oriented analysis and design", "software engineering", "virtual machines", "A");
        question.check();

        String headQuestion3 = "A class that implements a listener interface does which of the following?\n";
        headQuestion3 += "\n";
        question = new MultipleChoiceQuestion(headQuestion3, "It generates events. ", "It handles events.", "It maintains an object directory.",
                        "It records audio.", "It runs an event loop.", "B");
        question.check();

        String headQuestion4 = "Which one of the following claims about Java is INCORRECT?\n";

        question = new MultipleChoiceQuestion(headQuestion4, "A class is a type.", "An object belongs to a class.",
                "An object is an instance of a class.", "An object is a type.", "\"Object\"is a class.", "D");
        question.check();

        String headQuestion5 = "Do you want to be a Software Engineer?\n";
        question = new TrueFalseQuestion(headQuestion5, "TRUE");
        question.check();

        String headQuestion18 = "Are you a sad person?\n";
        question = new TrueFalseQuestion(headQuestion18, "FALSE");
        question.check();

        String headQuestion16 = "Do you hate Java?\n";
        question = new TrueFalseQuestion(headQuestion16, "FALSE");
        question.check();

        String headQuestion19 = "Is it fun learning computer languages?\n";
        question = new TrueFalseQuestion(headQuestion19, "TRUE");
        question.check();

        String headQuestion20 = "Do you want to learn more about Java?\n";
        question = new TrueFalseQuestion(headQuestion20, "TRUE");
        question.check();


        Question.showResults();
    }

}