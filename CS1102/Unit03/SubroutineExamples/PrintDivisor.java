import textio.TextIO;

public class PrintDivisor {

    public static void main(String[] args) {
        
        String inputLine; // Line of text input by user. 
        int myNumber;   // Number input by user.

        System.out.print("Enter a line of text: "); 
        inputLine = TextIO.getln(); 
        System.out.println();
        printRowsFromString( inputLine );

        System.out.println();
        System.out.print("Enter a positive number:");
        myNumber = TextIO.getInt();
        printDivisors(myNumber);

    }
        /**
        * Print all the divisors of N.
        * We assume that N is a positive integer. 
        */
        static void printDivisors(int N) {
            int D; // One of the possible divisors of N. 
            System.out.println("The divisors of " + N + " are:"); 
                for ( D = 1; D <= N; D++ ) {
                    if(N % D == 0) //Does D evenly divide N? 
                        System.out.println(D);
                } 
        }

        /**
        * Write one line of output containing N copies of the 
        * character ch. If N <= 0, an empty line is output. 
        */
        private static void printRow( char ch, int N ) {
            
            int i; // Loop-control variable for counting off the copies. 
            for ( i = 1; i <= N; i++ ) {
                System.out.print(ch); 
            }
            System.out.println(); 
        }

        /**
        * For each character in str, write a line of output 
        * containing 25 copies of that character.
        */
        private static void printRowsFromString( String str ) {
            int i; // Loop-control variable for counting off the chars. 
            for ( i = 0; i < str.length(); i++ ) {
                printRow(str.charAt(i), 25 ); 
            }
        }
    }
