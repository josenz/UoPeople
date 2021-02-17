enum NodeType { NUMBER, OPERATOR }   // Possible kinds of node.

class ExpNode { // A node in an expression tree. 

    NodeType kind;  // Which type of node is this?
    double number;  // The value in a node of type NUMBER.
    char op;        // The operator in a node of type OPERATOR.
    ExpNode left;   // Pointers to subtrees,
    ExpNode right;  //   in a node of type OPERATOR.

    public static void main(String[] args) {

        ExpNode number00 = new ExpNode(10);
        ExpNode number01 = new ExpNode(5);

        ExpNode result = new ExpNode('+', number00, number01);

        System.out.println(getValue(result));
    }

    ExpNode ( double val ) {
        // Constructor for making a node of type NUMBER.
        kind = NodeType.NUMBER;
        number = val;
    }

    ExpNode ( char op, ExpNode left, ExpNode right ) {
        // Constructor for making a node of type OPERATOR.
        kind = NodeType.OPERATOR;
        this.op = op;
        this.left = left;
        this.right = right;
    }

    static double getValue( ExpNode node ) {
        // Return the value of the expression represented by
        //  the tree to which node refers. Node must be non-null.
        if ( node.kind == NodeType.NUMBER ) {
            // The value of a NUMBER node is the number it holds.
            return node.number;
        }
        else { // The kind must be OPERATOR.
               // Get the values of the operands and combine them
               //   using the operator.
            double leftVal = getValue( node.left );
            double rightVal = getValue( node.right );
            switch ( node.op ) {
                case '+': return leftVal + rightVal;
                case '-': return leftVal - rightVal;
                case '*': return leftVal * rightVal;
                case '/': return leftVal / rightVal;
                default:  return Double.NaN;  // Bad Operator.
            }
        }
    } // end getValue()

} // end class ExpNode