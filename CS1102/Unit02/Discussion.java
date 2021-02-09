import textio.TextIO;

class Discussion {

    public static void main(String[] args) {

        int chocoBox1 = 12;
        int chocoBox2 = 12;
        int chocoBox3 = 12;
        
        while (chocoBox1 >= 1) {
            System.out.println("Give a chocolate to a nephew");
            chocoBox1--;
        }

        do {
            System.out.println("Give a chocolate to a grandmother");
            chocoBox2--;
        } while(chocoBox2 >= 1);

    
        for(int i = 0; i < chocoBox3; i++) {
            System.out.println("Give a chocolate to a uncle");
        }

        // The advantage of using the while loop here is that once "chocoBox1" which is our 
        // variable -- that represents our chocolates units in the box one -- is empty no more
        // chocolate will be given then no more computing is necessary.

        // The disavantage of the while loop is that it cannot compute any more lines
        // of code when it's boolean condition is no longer 'True'. Then making it a not good 
        // choice when a computation is necessary at least once inside the loop.

        int userAge;

        do {
            System.out.println("To have access to this game you must be over 12! Please type your age: "); 
            userAge = TextIO.getlnInt();
        } while(userAge <= 12);

        while(userAge > 12) {
            System.out.println(" You can play the game!");
            break;
        }

        for(int i = 0; i < 4; i++) {
            System.out.println("You can Play the game");
        }

        // The advantage of the do-while loop used here is that with this kind of loop
        // we can have a logic statement happens inside the loop at least once
        // before it checks for a conditional, so that way we can retrieve some data 
        // if necessary for some computation and after that we can scape the loop's block.

        // The disadvantage of the do-while loop is not very clear, as we can see here it can
        // be used as the same as other loops.


        for(int i = 10; i >= 0; i--) {
            System.out.println("Counting down for launch!" + i);
        }

        int n = 10;

        do {
            System.out.println("Counting down for launch!" + n);
            n--;
        } while(n >= 0);

        int count = 10;

        while(count >= 0) {
            System.out.println("Counting down for launch!" + count);
            count--;
        }

        // The advantage of the for loop is when we already know how many times
        // we should iterate through the loop and for being easier to read and to construct.

        // The disadvantage 

    }

}