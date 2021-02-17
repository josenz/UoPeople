public class Quiz {
    
    public static void main(String[] args) {

        String headQuestion0 = "Which statement is true?\n";
        headQuestion0 += "\n";

        headQuestion0 += "Select one:\n";
        headQuestion0 += "\n";

        headQuestion0 += "a. Queues require linked lists, but stacks do not.\n";
        headQuestion0 += "b. Stacks require linked lists, but queues do not.\n";
        headQuestion0 += "c. Queues use two ends of the structure; stacks use only one. \n";
        headQuestion0 += "d. Stacks use two ends of the structure, queues use only one.\n";
        headQuestion0 += "d. None of them.\n";

        
        

        Question question = new MultipleChoiceQuestion(headQuestion0, "A", "B", 
                                      "C", "D", "E","c");
        question.check();

        String headQuestion1 = "If the characters 'D', 'C', 'B', 'A' are placed in a queue (in that order),\n"; 
        headQuestion1 += "and then removed one at a time, in what order will they be removed?\n";
        headQuestion1 += "\n";

        headQuestion1 += "Select one:\n";

        headQuestion1 += "a. ABCD\n";
        headQuestion1 += "b. ABDC\n";
        headQuestion1 += "c. DCAB\n";
        headQuestion1 += "d. DCBA\n";
        headQuestion1 += "e. None of them.\n";

        question = new MultipleChoiceQuestion(headQuestion1, "A", "B", 
                                      "C", "D", "E", "d");
        question.check();

        String headQuestion2 = "In the linked list implementation of the queue class, where does the insert\n"; 
        headQuestion2 += "method place the new entry on the linked list?\n";
        headQuestion2 += "\n";

        headQuestion2 += "a. At the head.\n";
        headQuestion2 += "b. At the tail.\n";
        headQuestion2 += "c. After all other entries that are greater than the new entry.\n";
        headQuestion2 += "d. After all other entries that are smaller than the new entry.\n";
        headQuestion2 += "e. None of them.\n";
        headQuestion2 += "\n";

        question = new MultipleChoiceQuestion(headQuestion2, "a", "b", "c", "d",
                        "e", "b");
        question.check();


        String headQuestion4 = "Given the following code:\n";
        headQuestion4 += "\n";

        headQuestion4 += "static void showOutput(int mark) {\n";
        headQuestion4 += "    if (mark == 0) {\n";
        headQuestion4 += "        System.out.print(\" * \");\n";
        headQuestion4 += "    }";
        headQuestion4 += "    else {\n";
        headQuestion4 += "        System.out.println(\"[\");\n";
        headQuestion4 += "        showOutput(mark - 1);\n";
        headQuestion4 += "        System.out.print(\",\");\n";
        headQuestion4 += "        showOutput(mark - 1);\n";
        headQuestion4 += "        System.out.println(\"]\");\n";
        headQuestion4 += "    }";
        headQuestion4 += "}";
        headQuestion4 += "\n";

        headQuestion4 += "Can you determine what is produced by the following subroutine calls:\n";
        headQuestion4 += "showOutput(0), showOutput(1), showOutput(2), and showOutput(3)?\n";

        headQuestion4 += "a.\n";
        headQuestion4 += "showOutput(0) outputs:   *\n";
        headQuestion4 += "showOutput(1) outputs:   [*,*]\n";
        headQuestion4 += "showOutput(2) outputs:   [[*,*],[*,*]]\n";
        headQuestion4 += "showOutput(3) outputs:   [[[*,*],[*,*]],[[*,*],[*,*]]]\n";
        headQuestion4 += "\n";

        headQuestion4 += "b\n";
        headQuestion4 += "showOutput(0) outputs:   [\n";
        headQuestion4 += "showOutput(1) outputs:   *,*\n";
        headQuestion4 += "showOutput(2) outputs:   [[],[]]\n";
        headQuestion4 += "showOutput(3) outputs:   [[[*,*],[*,*]],[[*,*],[*,*]]]\n";
        headQuestion4 += "\n";

        headQuestion4 += "Select one:\n";
        headQuestion4 += "\n";

        headQuestion4 += "a.\n";
        headQuestion4 += "b.\n";

        question = new MultipleChoiceQuestion(headQuestion4, "A", "B",
                "C", "D", "E", "a");
        question.check();

        String headQuestion5 = "Consider the tree below. How many leaves does the tree below have?\n";

        headQuestion5 += "\n";
        headQuestion5 += "    14\n";
        headQuestion5 += "   /  \\\n";
        headQuestion5 += "  2    11\n";
        headQuestion5 += " / \\   /  \\\n";
        headQuestion5 += "1  3  10  30\n";
        headQuestion5 += "      /    /  \n";
        headQuestion5 += "     7    40  \n";
        headQuestion5 += "\n";

        headQuestion5 += "Select one:\n";
        headQuestion5 += "\n";

        headQuestion5 += "a. 2\n";
        headQuestion5 += "b. 4\n";
        headQuestion5 += "c. 6\n";
        headQuestion5 += "d. 8\n";
        headQuestion5 += "e. 9\n";

        question = new MultipleChoiceQuestion(headQuestion5, "a", "b",
                "c", "d", "e", "b");
        question.check();

        String headQuestion7 = "What is the value stored in the parent node of the node containing 30?\n";
        headQuestion7 += "\n";

        headQuestion7 += "\n";
        headQuestion7 += "    14\n";
        headQuestion7 += "   /  \\\n";
        headQuestion7 += "  2    11\n";
        headQuestion7 += " / \\   /  \\\n";
        headQuestion7 += "1  3  10  30\n";
        headQuestion7 += "      /    /  \n";
        headQuestion7 += "     7    40  \n";
        headQuestion7 += "\n";

        headQuestion7 += "Select one:\n";
        headQuestion7 += "\n";

        headQuestion7 += "a. 10\n";
        headQuestion7 += "b. 11\n";
        headQuestion7 += "c. 14\n";
        headQuestion7 += "d. 40\n";
        headQuestion7 += "e. None of the above\n";
        

        question = new MultipleChoiceQuestion(headQuestion7, "a", "b", "c", "d", "e", "b");
        question.check();

        String headQuestion8 = "Consider the tree below. What is the order of nodes visited using a pre-order traversal?\n";
        headQuestion8 += "\n";

        headQuestion8 += "\n";
        headQuestion8 += "    14\n";
        headQuestion8 += "   /  \\\n";
        headQuestion8 += "  2    11\n";
        headQuestion8 += " / \\   /  \\\n";
        headQuestion8 += "1  3  10  30\n";
        headQuestion8 += "      /    /  \n";
        headQuestion8 += "     7    40  \n";
        headQuestion8 += "\n";

        headQuestion8 += "Select one:\n";
        headQuestion8 += "\n";

        headQuestion8 += "a. 1 2 3 7 10 11 14 30 40\n";
        headQuestion8 += "b. 1 2 3 14 7 10 11 40 30\n";
        headQuestion8 += "c. 1 3 2 7 10 40 30 11 14\n";
        headQuestion8 += "d. 14 2 1 3 11 10 7 30 40\n";

        question = new MultipleChoiceQuestion(headQuestion8, "a", "b", "c", "d", "e", "d");
        question.check();

        String headQuestion9 = "Consider the tree below. What is the order of nodes visited using an in-order traversal?\n";
        headQuestion9 += "\n";

        headQuestion9 += "\n";
        headQuestion9 += "    14\n";
        headQuestion9 += "   /  \\\n";
        headQuestion9 += "  2    11\n";
        headQuestion9 += " / \\   /  \\\n";
        headQuestion9 += "1  3  10  30\n";
        headQuestion9 += "      /    /  \n";
        headQuestion9 += "     7    40  \n";
        headQuestion9 += "\n";

        headQuestion9 += "Select one:\n";
        headQuestion9 += "\n";

        headQuestion9 += "a. 1 2 3 7 10 11 14 30 40\n";
        headQuestion9 += "b. 1 2 3 14 7 10 11 40 30\n";
        headQuestion9 += "c. 1 3 2 7 10 40 30 11 14\n";
        headQuestion9 += "d. 14 2 1 3 11 10 7 30 40\n";

        question = new MultipleChoiceQuestion(headQuestion9, "a", "b", "c", "d", "e", "b");
        question.check();

        String headQuestion10 = "Study the following three pieces of code. Comments have been removed intentionally.\n";
        headQuestion10 += "Can you guess what each does?\n";

        headQuestion10 += "\n";

        headQuestion10 += "(i)                                                                                         (ii)                                       (iii)\n";
        headQuestion10 += "public class ProcForInts {                                                     public class ProcForInts {                 public class ProcForInts {\n";
        headQuestion10 += "    private int[] items = new int[10];                                            /**                                        private static class Node {\n";
        headQuestion10 += "    private int top = 0;                                                           * Procedure                                   int item;\n";
        headQuestion10 += "    /**                                                                            */                                            Node next;\n";
        headQuestion10 += "     * Procedure                                                                  private static class Node {               }\n";
        headQuestion10 += "     */                                                                               int item;                             private Node top;\n";
        headQuestion10 += "    public void push( int N ) {                                                       Node next;                            private Node top;\n";
        headQuestion10 += "        if (top == items.length) {                                                }                                         /**\n";
        headQuestion10 += "            int[] newArray = new int[ 2*items.length ];                           private Node head = null;           * Procedure\n";
        headQuestion10 += "            System.arraycopy(items, 0, newArray, 0, items.length);                private Node tail = null;                        */\n";
        headQuestion10 += "            items = newArray                                                      /**                                  public void push( int N ) {\n";
        headQuestion10 += "        }                                                                          * Procedure                            Node newTop;\n";
        headQuestion10 += "        items[top] = N;                                                            */                                     newTop = new Node();\n";
        headQuestion10 += "        top++;                                                                    public void enqueue( int N ) {                         newTop.item = N; \n";
        headQuestion10 += "    }                                                                                 Node newTail = new Node();               newTop.next = top; \n";
        headQuestion10 += "    /**                                                                               newTail.item = N;                         top = newTop;\n";
        headQuestion10 += "     * Procedure                                                                      if (head == null) {                     }\n";
        headQuestion10 += "     */                                                                                   head = newTail;                     /**\n";
        headQuestion10 += "     public int pop() {                                                                   tail = newTail;                      * Procedure\n";
        headQuestion10 += "         if ( top == 0 )                                                              }                                        */\n";
        headQuestion10 += "             throw new IllegalStateException(\"Can't…\");                             else {                     public int pop() {\n";
        headQuestion10 += "         int topItem = items[top - 1                                                      tail.next = newTail;                         if ( top == null )\n";
        headQuestion10 += "         top--                                                                            tail = newTail                              throw new IllegalStateException(\"Cannot…\");\n";
        headQuestion10 += "         return topItem;                                                              }                                      int topItem = top.item; \n";
        headQuestion10 += "}                                                                                 }                                        top = top.next; \n";
        headQuestion10 += "    /**                                                                           /**                                        return topItem; \n";
        headQuestion10 += "     * Procedure                                                                   * Procedure                         } \n";
        headQuestion10 += "     */                                                                            */                                  /** \n";
        headQuestion10 += "    public boolean isEmpty() {                                                    public int dequeue() {                      * Procedure \n";
        headQuestion10 += "        return (top == 0);                                                            if ( head == null)                      */ \n";
        headQuestion10 += "    }               public class ProcForInts {                                            throw new IllegalStateException(\"Can't…\"); public boolean isEmpty() { \n";
        headQuestion10 += "}                                                                                     int firstItem = head.item;                         return (top == null); \n";
        headQuestion10 += "                                                                                      head = head.next;                      } \n";
        headQuestion10 += "                                                                                      if (head == null) {                 } \n";
        headQuestion10 += "                                                                                          tail = null;                 } \n";
        headQuestion10 += "                                                                                      }                              } \n";
        headQuestion10 += "                                                                                      return firstItem;                 } \n";
        headQuestion10 += "                                                                                  }                                      } \n";
        headQuestion10 += "                                                                                  /**                                      } \n";
        headQuestion10 += "                                                                                   * Procecure                                      } \n";
        headQuestion10 += "                                                                                   */                                      } \n";
        headQuestion10 += "                                                                                  boolean isEmpty() {                                      } \n";
        headQuestion10 += "                                                                                      return (head == null);                                      } \n";
        headQuestion10 += "                                                                                  }                                      } \n";
        headQuestion10 += "                                                                              }                                      } \n";

        question = new MultipleChoiceQuestion(headQuestion10, "a", "b", "c", "d", "e", "b");
        question.check();


        Question.showResults();
    }

}