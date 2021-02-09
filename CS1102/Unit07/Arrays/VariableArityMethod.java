public class VariableArityMethod {

    public static void main(String[] args) {
        double[] myDouble = new double[2];
        myDouble[0] = 0.5;
        myDouble[1] = 10.5;
        double myAverage = average(myDouble);
        System.out.print(myAverage);
    }

    public static double average( double... numbers ) {
        // Inside this method, numbers is of type double[].
        double sum;  // The sum of all the actual parameters.
        double average; // The average of all the actual parameters.
        sum = 0;
        for ( int i = 0; i < numbers.length; i++ ) {
            sum = sum + numbers[i];  // Add one of the actual parameters to the sum.
        }
        average = sum / numbers.length;
        return average;
    }
}