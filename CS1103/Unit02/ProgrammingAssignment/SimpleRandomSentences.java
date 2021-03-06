
// For the first exercise of the lab, you should write a similar 
//  program that implements the following rules:

// <sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]

public class SimpleRandomSentences {

    // <conjunction> ::= and | or | but | because
    static final String[] conjunction = {"and", "or", "but", "because"};

    // <proper_noun> ::= Fred | Jane | Richard Nixon | Miss America
    static final String[] properNoun = {"Fred", "Jane", "Richard Nixon", "Miss America"};

    // <common_noun> ::= man | woman | fish | elephant | unicorn
    static final String[] commonNoun = {"man", "woman", "fish", "elephant", "unicorn"};

    // <determiner> ::= a | the | every | some
    static final String[] determiner = {"a", "the", "every", "some"};

    // <adjective> ::= big | tiny | pretty | bald
    static final String[] adjective = {"big", "tiny", "pretty", "bald"};

    // <intransitive_verb> ::= runs | jumps | talks | sleeps
    static final String[] intransitiveVerb = {"runs", "jumps", "talks", "sleeps"};

    // <transitive_verb> ::= loves | hates | sees | knows | looks for | finds
    static final String[] transitiveVerb = {"lover", "hates", "sees", "knows", "looks for", "finds"};

    public static void main(String[] args) {
        while (true) {
            randomSentence();
            System.out.println(".\n\n");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }

    static void randomSentence() {
        // <sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]
        // <simple_sentence> ::= <noun_phrase> <verb_phrase>
        randomNounPhrase();
        randomVerbPhrase();

        // An optional element (represented by brackets, "[ xxx ]") can be implemented
        // by a simple if.
        if (Math.random() >= 0.8) {
            System.out.print(randomItem(conjunction) + " ");
            randomSentence();
        }
        

    }

    static void randomNounPhrase() {

        // <noun_phrase>   ::=   <proper_noun> | <determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]
        // Note that a choice of alternatives (represented in the rules by "|") can be implemented using a switch 
        // or if..else statement; the various choices don't necessarily have to have the same probability.
        if ((int)(Math.random()) > 7) {
            System.out.print(randomItem(properNoun) + " ");
        }
        else {
            System.out.print(randomItem(determiner) + " ");
            
            // And a repeated optional element (represented by brackets with dots, "[ xxx
            // ]...") can be represented by a while loop.
            while ((int) (Math.random()) > 1) {
                System.out.print(randomItem(adjective) + " ");
            }
        }

        
        System.out.print(randomItem(commonNoun) + " ");

        // An optional element (represented by brackets, "[ xxx ]") can be implemented
        // by a simple if.
        if (Math.random() > 0.5) {
            System.out.print("who ");
            // <verb_phrase> ::= <intransitive_verb> | <transitive_verb> <noun_phrase> | is <adjective> | believes that <simple_sentence>
            randomVerbPhrase();
        }
        
    }

    static void randomVerbPhrase() {
        // <verb_phrase> ::= <intransitive_verb> | <transitive_verb> <noun_phrase> | is <adjective> | believes that <simple_sentence>
        // Note that a choice of alternatives (represented in the rules by "|") can be
        // implemented using a switch or if..else statement; the various choices don't necessarily have to have the same probability.
        int randomNumber = (int) Math.random() + 2;
        switch (randomNumber) {
            case 2:
                // <intransitive_verb>
                System.out.print(randomItem(intransitiveVerb) + " ");
                break;
            case 4:
                // <transitive_verb> <noun_phrase>
                System.out.print(randomItem(transitiveVerb) + " ");
                randomNounPhrase();
                break;
            case 6:
                // is <adjective>
                System.out.print(" is ");
                System.out.print(randomItem(adjective));
                break;
            case 8:
                // believes that <simple_sentence>
                System.out.print(" believes that ");
                // <simple_sentence> ::= <noun_phrase> <verb_phrase>
                randomNounPhrase();
                randomVerbPhrase();
                break;
        
            default:
                // <intransitive_verb>
                System.out.print(randomItem(intransitiveVerb));
                break;
        }
    }

     static String randomItem(String[] listOfStrings) {

        int i = (int) (Math.random() * listOfStrings.length);
        return listOfStrings[i];
    }

    static void simpleSentence() {
        // <simple_sentence> ::= <noun_phrase> <verb_phrase>
        randomNounPhrase(); 
        randomVerbPhrase();

    }

}