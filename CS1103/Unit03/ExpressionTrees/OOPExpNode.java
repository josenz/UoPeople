class OOPExpNode {

    static abstract class ExpNode {
        // Represents a node of any type in an expression tree.

        abstract double value(); // Return the value of this node.

    } //  end class ExpNode

    static class ConstNode extends ExpNode {
        // Represents a node that holdes a number.

        double number; // The number in the node.

        ConstNode( double val ) {
            // Constructor. Create a node to hold val.
            number = val;
        }

        double value() {
            // The value is just the number that the node holds.
            return number;
        }

    } // end class ConstNode

    static class BinOpNode extends ExpNode {
        // Represents a node that holds an operator.

        char op;       // The operator.
        ExpNode left;  // The left operand.
        ExpNode right; // The right operand.

        BinOpNode( char op, ExpNode left, ExpNode right ) {
            // Constructor. Create a node to hold the given data.
            this.op = op;
            this.left = left;
            this.right = right;
        }

        double value() {
                // To get the value, compute the value of the left and
                // right operands, and combine them with the operator.
            double leftVal = left.value();
            double rightVal = right.value();
            switch ( op ) {
                case '+': return leftVal + rightVal;
                case '-': return leftVal - rightVal;
                case '*': return leftVal * rightVal;
                case '/': return leftVal / rightVal;
                default:  return Double.NaN;  // Bad Operator.
            }
        }

    } // end class BinOpNode

    public static void main(String[] args) {

        ExpNode number00 = new ConstNode(10);
        ExpNode number01 = new ConstNode(5);

        ExpNode result = new BinOpNode('+', number00, number01);

        System.out.println(result.value());
    }

} // end class OOPExpNode