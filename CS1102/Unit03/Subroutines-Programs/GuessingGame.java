import textio.TextIO;

public class GuessingGame {

    static int gamesPlayed; // The number of games played.
    static int gamesWon;    // The number of games won.

    public static void main(String[] args) {

        // This is actually redundant, since 0 is the default initial value.
        gamesPlayed = 0;
        gamesWon = 0;

        System.out.println("Let's play a game. I will pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        boolean playAgain;

        do {
            playGame(); // call subroutines to play one game
            System.out.print("Would you like to play again?");
            playAgain = TextIO.getlnBoolean();
        } while(playAgain);
        System.out.println("Thanks for playing. Goodbye.");
    } // end of main()

    static void playGame() {

        /** 
         * Start with an outline of the algorithm and apply stepwise refinement.
         * Here is a short pseudocode algorithm for a guessing game routine.
        */

        // Pick a random number 
        // While the game is not over:
            // Get the user's guess
            // Tell the user whether the guess is high, low, or correct.

        // The test for whether the game is over is complicated, since the game 
        // ends if either the user makes a correct guess or the number of guesses 
        // is six. As in many cases, the easiest thing to do is to use a “while (true)” 
        // loop and use break to end the loop whenever we find a reason to do so. Also, 
        // if we are going to end the game after six guesses, we’ll have to keep track 
        // of the number of guesses that the user has made. Filling out the algorithm gives:

        // Let computersNumber be a random number between 1 and 100 
        int computersNumber; // A random number picked by the computer.
        int usersGuess;      // A number entered by user as a guess.
        // Let guessCount = 0
        int guessCount;      // Number of guesses the user has made.
        gamesPlayed++;       // Count this game.
        // The value assigned to computersNumber is a randomly
        // chosen integer between 1 and 100, inclusive.
        computersNumber = (int)(100 * Math.random()) + 1;
        guessCount = 0;
        System.out.println("What is your first guess? ");
        while (true) {
        //    Get the user’s guess
            usersGuess = TextIO.getInt();  // Get the user's guess.
            // Count the guess by adding 1 to guess count
            guessCount++;
        //    if the user’s guess equals computersNumber:
            if (usersGuess == computersNumber) {
                // Tell the user he won
                System.out.println("You got it in " + guessCount
                    + " guesses! My number was " + computersNumber);
                gamesWon++;
                // break out of the loop
                break; // The game is over; the user has won.
            }
        //    if the number of guesses is 6:
            if (guessCount == 6) {
                // Tell the user he lost
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                // break out of the loop
                break; // The game is over; the user has lost.
            }
            // if we get to this point, the game continues.
            // if the user’s guess is less than computersNumber:
            if (usersGuess < computersNumber)
            // Tell the user the guess was low
                System.out.print("That's too low. Try again: ");
            // else if the user’s guess is higher than computersNumber:
            else if (usersGuess > computersNumber) {
            //    Tell the user the guess was high
                System.out.print("That's too high. Try again: ");
            }
            System.out.println();
        } // end of playGame()

    } // end of class GuessingGame
}

// Take some time to read the program carefully and figure out
// how it works. And try to convince yourself that even in this 
// relatively simple case, breaking up the program into two methods
// makes the program easier to understand and probably made it easier
// to write each piece.