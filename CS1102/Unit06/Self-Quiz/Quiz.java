public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "Consider the following Java program. What is the superclass of \"MouseWhisperer\"?\n";
        headQuestion0 += "\n";

        headQuestion0 += "import java.awt.event.*;\n";
        headQuestion0 += "import javax.swing.*;\n";
        headQuestion0 += "public class MouseWhisperer extends JFrame implements MouseListener {\n";
        headQuestion0 += "    MouseWhisperer() {\n";
        headQuestion0 += "        super(\"COME CLOSER\");\n";
        headQuestion0 += "        setSize(300,100);\n";
        headQuestion0 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion0 += "        addMouseListener(this);\n";
        headQuestion0 += "        setVisible(true);\n";
        headQuestion0 += "    }\n";
        headQuestion0 += "public void mouseClicked(MouseEvent e) { setTitle(\"OUCH\"); }\n";
        headQuestion0 += "public void mousePressed(MouseEvent e) { setTitle(\"LET GO\"); }\n";
        headQuestion0 += "public void mouseReleased(MouseEvent e) { setTitle(\"WHEW\"); }\n";
        headQuestion0 += "public void mouseEntered(MouseEvent e) { setTitle(\"I SEE YOU\"); }\n";
        headQuestion0 += "public void mouseExited(MouseEvent e) { setTitle(\"COME CLOSER\"); }\n";
        headQuestion0 += "public static void main(String[] args) { new MouseWhisperer(); }\n";
        headQuestion0 += "}\n";


        Question question = new MultipleChoiceQuestion(headQuestion0, "java.awt.event", "JFrame", 
                                      "MouseEvent", "MouseListener", "this", "b");
        question.check();

        String headQuestion1 = "Which one of the following is an event handler?\n";
        headQuestion1 += "\n";

        question = new MultipleChoiceQuestion(headQuestion1, "an event generator", "an event listener", 
                                      "an event loop", "an event method", "java.awt.event", "b");
        question.check();


        String headQuestion2 = "Consider the following Java program. Which one of the following is a package?\n";
        headQuestion2 += "\n";

        headQuestion2 += "import java.awt.event.*;\n";
        headQuestion2 += "import javax.swing.*;\n";
        headQuestion2 += "public class MouseWhisperer extends JFrame implements MouseListener {\n";
        headQuestion2 += "    MouseWhisperer() {\n";
        headQuestion2 += "        super(\"COME CLOSER\");\n";
        headQuestion2 += "        setSize(300,100);\n";
        headQuestion2 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion2 += "        addMouseListener(this);\n";
        headQuestion2 += "        setVisible(true);\n";
        headQuestion2 += "    }\n";
        headQuestion2 += "    public void mouseClicked(MouseEvent e) { setTitle(\"OUCH\"); }\n";
        headQuestion2 += "    public void mousePressed(MouseEvent e) { setTitle(\"LET GO\"); }\n";
        headQuestion2 += "    public void mouseReleased(MouseEvent e) { setTitle(\"WHEW\"); }\n";
        headQuestion2 += "    public void mouseEntered(MouseEvent e) { setTitle(\"I SEE YOU\"); }\n";
        headQuestion2 += "    public void mouseExited(MouseEvent e) { setTitle(\"COME CLOSER\"); }\n";
        headQuestion2 += "    public static void main(String[] args) { new MouseWhisperer(); }\n";
        headQuestion2 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion2, "java.awt.event", "JFrame", "MouseEvent",
                        "MouseListener", "this", "a");
        question.check();


        String headQuestion3 = "Consider the following Java program. Which statement registers an object to receive events?\n";
        headQuestion3 += "\n";

        headQuestion3 += "import java.awt.event.*;\n";
        headQuestion3 += "import javax.swing.*;\n";
        headQuestion3 += "public class Clicker extends JFrame implements ActionListener {\n";
        headQuestion3 += "    int count;\n";
        headQuestion3 += "    JButton button;\n";
        headQuestion3 += "    Clicker() {\n";
        headQuestion3 += "        super(\"Click Me\");\n";
        headQuestion3 += "        button = new JButton(String.valueOf(count));\n";
        headQuestion3 += "        add(button);\n";
        headQuestion3 += "        button.addActionListener(this);\n";
        headQuestion3 += "        setSize(200,100);\n";
        headQuestion3 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion3 += "        setVisible(true);\n";
        headQuestion3 += "    }\n";
        headQuestion3 += "    public void actionPerformed(ActionEvent e) {\n";
        headQuestion3 += "        count++;\n";
        headQuestion3 += "        button.setText(String.valueOf(count));\n";
        headQuestion3 += "    }\n";
        headQuestion3 += "    public static void main(String[] args) { new Clicker(); }\n";
        headQuestion3 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion3, "add(button);", "button.addActionListener(this);", 
                                                        "button.setText(String.valueOf(count));", "setVisible(true);",
                                                                                        "super(\"Click Me\");", "b");
        question.check();


        String headQuestion4 = "Consider the following Java program. Which object registers event listeners?\n";
        headQuestion4 += "\n";

        headQuestion4 += "import java.awt.event.*;\n";
        headQuestion4 += "import javax.swing.*;\n";
        headQuestion4 += "public class MouseWhisperer extends JFrame implements MouseListener {\n";
        headQuestion4 += "    MouseWhisperer() {\n";
        headQuestion4 += "        super(\"COME CLOSER\");\n";
        headQuestion4 += "        setSize(300,100);\n";
        headQuestion4 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion4 += "        addMouseListener(this);\n";
        headQuestion4 += "        setVisible(true);\n";
        headQuestion4 += "    }\n";
        headQuestion4 += "    public void mouseClicked(MouseEvent e) { setTitle(\"OUCH\"); }\n";
        headQuestion4 += "    public void mousePressed(MouseEvent e) { setTitle(\"LET GO\"); }\n";
        headQuestion4 += "    public void mouseReleased(MouseEvent e) { setTitle(\"WHEW\"); }\n";
        headQuestion4 += "    public void mouseEntered(MouseEvent e) { setTitle(\"I SEE YOU\"); }\n";
        headQuestion4 += "    public void mouseExited(MouseEvent e) { setTitle(\"COME CLOSER\"); }\n";
        headQuestion4 += "    public static void main(String[] args) { new MouseWhisperer(); }\n";
        headQuestion4 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion4, "java.awt.event", "JFrame", "MouseEvent", "MouseListener",
                        "this", "e");
        question.check();


        String headQuestion5 = "A class that implements a listener interface does which of the following?\n";
        headQuestion5 += "\n";

        question = new MultipleChoiceQuestion(headQuestion5, "It generates events. ", "It handles events.", "It maintains an object directory.",
                        "It records audio.", "It runs an event loop.", "b");
        question.check();


        String headQuestion6 = "Consider the following Java program. Which object registers event listeners?\n";
        headQuestion6 += "\n";

        headQuestion6 += "import java.awt.event.*;\n";
        headQuestion6 += "import javax.swing.*;\n";
        headQuestion6 += "public class MouseWhisperer extends JFrame implements MouseListener {\n";
        headQuestion6 += "    MouseWhisperer() {\n";
        headQuestion6 += "        super(\"COME CLOSER\");\n";
        headQuestion6 += "        setSize(300,100);\n";
        headQuestion6 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion6 += "        addMouseListener(this);\n";
        headQuestion6 += "        setVisible(true);\n";
        headQuestion6 += "    }\n";
        headQuestion6 += "    public void mouseClicked(MouseEvent e) { setTitle(\"OUCH\"); }\n";
        headQuestion6 += "    public void mousePressed(MouseEvent e) { setTitle(\"LET GO\"); }\n";
        headQuestion6 += "    public void mouseReleased(MouseEvent e) { setTitle(\"WHEW\"); }\n";
        headQuestion6 += "    public void mouseEntered(MouseEvent e) { setTitle(\"I SEE YOU\"); }\n";
        headQuestion6 += "    public void mouseExited(MouseEvent e) { setTitle(\"COME CLOSER\"); }\n";
        headQuestion6 += "    public static void main(String[] args) { new MouseWhisperer(); }\n";
        headQuestion6 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion6, "java.awt.event", "JFrame", "MouseEvent", "MouseListener",
                        "this", "e");
        question.check();

        String headQuestion7 = "A class that implements a listener interface does which of the following?";

        question = new MultipleChoiceQuestion(headQuestion7, "It generates events.", "It handles events.", "It maintains an object directory.", 
                                                                "It records audio.", "It runs an event loop", "b");
        
        question.check();


        String headQuestion8 = "Consider the following Java program. Which one of the following is an interface?\n";
        headQuestion8 += "\n";

        headQuestion8 += "import java.awt.event.*;\n";
        headQuestion8 += "import javax.swing.*;\n";
        headQuestion8 += "public class MouseWhisperer extends JFrame implements MouseListener {\n";
        headQuestion8 += "    MouseWhisperer() {\n";
        headQuestion8 += "        super(\"COME CLOSER\");\n";
        headQuestion8 += "        setSize(300,100);\n";
        headQuestion8 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion8 += "        addMouseListener(this);\n";
        headQuestion8 += "        setVisible(true);\n";
        headQuestion8 += "    }\n";
        headQuestion8 += "    public void mouseClicked(MouseEvent e) { setTitle(\"OUCH\"); }\n";
        headQuestion8 += "    public void mousePressed(MouseEvent e) { setTitle(\"LET GO\"); }\n";
        headQuestion8 += "    public void mouseReleased(MouseEvent e) { setTitle(\"WHEW\"); }\n";
        headQuestion8 += "    public void mouseEntered(MouseEvent e) { setTitle(\"I SEE YOU\"); }\n";
        headQuestion8 += "    public void mouseExited(MouseEvent e) { setTitle(\"COME CLOSER\"); }\n";
        headQuestion8 += "    public static void main(String[] args) { new MouseWhisperer(); }\n";
        headQuestion8 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion8, "java.awt.event", "JFrame", "MouseEvent", "MouseListener",
                        "this", "d");
        question.check();



        String headQuestion9 = "Consider the following Java program. Which statement updates the appearance of a button?\n";
        headQuestion9 += "\n";

        headQuestion9 += "import java.awt.event.*;\n";
        headQuestion9 += "import javax.swing.*;\n";
        headQuestion9 += "public class Clicker extends JFrame implements ActionListener {\n";
        headQuestion9 += "    int count;\n";
        headQuestion9 += "    JButton button;\n";
        headQuestion9 += "    Clicker() {\n";
        headQuestion9 += "        super(\"Click Me\");\n";
        headQuestion9 += "        button = new JButton(String.valueOf(count));\n";
        headQuestion9 += "        add(button);\n";
        headQuestion9 += "        button.addActionListener(this);\n";
        headQuestion9 += "        setSize(200,100);\n";
        headQuestion9 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion9 += "        setVisible(true);\n";
        headQuestion9 += "    }\n";
        headQuestion9 += "    public void actionPerformed(ActionEvent e) {\n";
        headQuestion9 += "        count++;\n";
        headQuestion9 += "        button.setText(String.valueOf(count));\n";
        headQuestion9 += "    }\n";
        headQuestion9 += "    public static void main(String[] args) { new Clicker(); }\n";
        headQuestion9 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion9, "add(button);", "button.addActionListener(this);",
                        "button.setText(String.valueOf(count));", "setVisible(true);", "super(\"Click Me\");", "c");
        question.check();



        String headQuestion10 = "Consider the following Java program. Which statement updates the appearance of a button?\n";
        headQuestion10 += "\n";

        headQuestion10 += "import java.awt.event.*;\n";
        headQuestion10 += "import javax.swing.*;\n";
        headQuestion10 += "public class Clicker extends JFrame implements ActionListener {\n";
        headQuestion10 += "    int count;\n";
        headQuestion10 += "    JButton button;\n";
        headQuestion10 += "    Clicker() {\n";
        headQuestion10 += "        super(\"Click Me\");\n";
        headQuestion10 += "        button = new JButton(String.valueOf(count));\n";
        headQuestion10 += "        add(button);\n";
        headQuestion10 += "        button.addActionListener(this);\n";
        headQuestion10 += "        setSize(200,100);\n";
        headQuestion10 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion10 += "        setVisible(true);\n";
        headQuestion10 += "    }\n";
        headQuestion10 += "    public void actionPerformed(ActionEvent e) {\n";
        headQuestion10 += "        count++;\n";
        headQuestion10 += "        button.setText(String.valueOf(count));\n";
        headQuestion10 += "    }\n";
        headQuestion10 += "    public static void main(String[] args) { new Clicker(); }\n";
        headQuestion10 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion10, "add(button);", "button.addActionListener(this);",
                        "button.setText(String.valueOf(count));", "setVisible(true);", "super(\"Click Me\");", "c");
        question.check();


        String headQuestion11 = "Consider the following Java program. Which line gives the \"Clicker\" class access to the \"JButton\" class definition?\n";
        headQuestion11 += "\n";

        headQuestion11 += "import java.awt.event.*;\n";
        headQuestion11 += "import javax.swing.*;\n";
        headQuestion11 += "public class Clicker extends JFrame implements ActionListener {\n";
        headQuestion11 += "    int count;\n";
        headQuestion11 += "    JButton button;\n";
        headQuestion11 += "    Clicker() {\n";
        headQuestion11 += "        super(\"Click Me\");\n";
        headQuestion11 += "        button = new JButton(String.valueOf(count));\n";
        headQuestion11 += "        add(button);\n";
        headQuestion11 += "        button.addActionListener(this);\n";
        headQuestion11 += "        setSize(200,100);\n";
        headQuestion11 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion11 += "        setVisible(true);\n";
        headQuestion11 += "    }\n";
        headQuestion11 += "    public void actionPerformed(ActionEvent e) {\n";
        headQuestion11 += "        count++;\n";
        headQuestion11 += "        button.setText(String.valueOf(count));\n";
        headQuestion11 += "    }\n";
        headQuestion11 += "    public static void main(String[] args) { new Clicker(); }\n";
        headQuestion11 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion11, "button = new JButton(String.valueOf(count));", "import java.awt.event.*;",
                        "import javax.swing.*;", "JButton button; ", "public class Clicker extends JFrame implements ActionListener {", "c");
        question.check();


        String headQuestion12 = "Consider the following Java program. Which statement displays a window with a button on the screen?\n";
        headQuestion12 += "\n";

        headQuestion12 += "import java.awt.event.*;\n";
        headQuestion12 += "import javax.swing.*;\n";
        headQuestion12 += "public class Clicker extends JFrame implements ActionListener {\n";
        headQuestion12 += "    int count;\n";
        headQuestion12 += "    JButton button;\n";
        headQuestion12 += "    Clicker() {\n";
        headQuestion12 += "        super(\"Click Me\");\n";
        headQuestion12 += "        button = new JButton(String.valueOf(count));\n";
        headQuestion12 += "        add(button);\n";
        headQuestion12 += "        button.addActionListener(this);\n";
        headQuestion12 += "        setSize(200,100);\n";
        headQuestion12 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion12 += "        setVisible(true);\n";
        headQuestion12 += "    }\n";
        headQuestion12 += "    public void actionPerformed(ActionEvent e) {\n";
        headQuestion12 += "        count++;\n";
        headQuestion12 += "        button.setText(String.valueOf(count));\n";
        headQuestion12 += "    }\n";
        headQuestion12 += "    public static void main(String[] args) { new Clicker(); }\n";
        headQuestion12 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion12, "add(button);",
                        "button.addActionListener(this);", "button.setText(String.valueOf(count));", "setVisible(true);",
                        "super(\"Click Me\")", "c");
        question.check();


        String headQuestion13 = "Consider the following Java program. Which statement registers an object to receive events?\n";
        headQuestion13 += "\n";

        headQuestion13 += "import java.awt.event.*;\n";
        headQuestion13 += "import javax.swing.*;\n";
        headQuestion13 += "public class Clicker extends JFrame implements ActionListener {\n";
        headQuestion13 += "    int count;\n";
        headQuestion13 += "    JButton button;\n";
        headQuestion13 += "    Clicker() {\n";
        headQuestion13 += "        super(\"Click Me\");\n";
        headQuestion13 += "        button = new JButton(String.valueOf(count));\n";
        headQuestion13 += "        add(button);\n";
        headQuestion13 += "        button.addActionListener(this);\n";
        headQuestion13 += "        setSize(200,100);\n";
        headQuestion13 += "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n";
        headQuestion13 += "        setVisible(true);\n";
        headQuestion13 += "    }\n";
        headQuestion13 += "    public void actionPerformed(ActionEvent e) {\n";
        headQuestion13 += "        count++;\n";
        headQuestion13 += "        button.setText(String.valueOf(count));\n";
        headQuestion13 += "    }\n";
        headQuestion13 += "    public static void main(String[] args) { new Clicker(); }\n";
        headQuestion13 += "}\n";

        question = new MultipleChoiceQuestion(headQuestion13, "add(button);", "button.addActionListener(this);",
                        "button.setText(String.valueOf(count));", "setVisible(true);", "super(\"Click Me\")", "b");
        question.check();
        


        String headQuestion = "Do you want to be a Software Engineer?\n";
        question = new TrueFalseQuestion(headQuestion, "TRUE");
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