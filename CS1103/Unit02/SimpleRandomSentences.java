
public class SimpleRandomSentences {

    static final String[] conjunction = {"and", "or", "but", "because"};

    static final String[] properNoun = {"Fred", "Jane", "Richard Nixon", "Miss America"};

    static final String[] commonNoun = {"man", "woman", "fish", "elephant", "unicorn"};

    static final String[] determiner = {"a", "the", "every", "some"};

    static final String[] adjective = {"big", "tiny", "pretty", "bald"};

    static final String[] intransitiveVerb = {"runs", "jumps", "talks", "sleeps"};

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

        randomNounPhrase();
        randomVerbPhrase();

        if (Math.random() >= 0.8) {
            System.out.print(randomItem(conjunction) + " ");
            randomSentence();
        }

    }

    static void randomNounPhrase() {

        if ((int)(Math.random()) > 7) {
            System.out.print(randomItem(properNoun) + " ");
        }
        else {
            System.out.print(randomItem(determiner) + " ");
            
            while ((int) (Math.random()) > 1) {
                System.out.print(randomItem(adjective) + " ");
            }
        }

        
        System.out.print(randomItem(commonNoun) + " ");

        if (Math.random() > 0.5) {
            System.out.print("who ");
            randomVerbPhrase();
        }
        
    }

    static void randomVerbPhrase() {

        int randomNumber = (int) Math.random() + 2;
        switch (randomNumber) {
            case 2:
                System.out.print(randomItem(intransitiveVerb) + " ");
                break;
            case 4:
                System.out.print(randomItem(transitiveVerb) + " ");
                randomNounPhrase();
                break;
            case 6:
                System.out.print(" is ");
                System.out.print(randomItem(adjective));
                break;
            case 8:
                System.out.print(" believes that ");
                randomNounPhrase();
                randomVerbPhrase();
                break;
        
            default:
                System.out.print(randomItem(intransitiveVerb));
                break;
        }
    }

     static String randomItem(String[] listOfStrings) {

        int i = (int) (Math.random() * listOfStrings.length);
        return listOfStrings[i];
    }

    static void simpleSentence() {
        randomNounPhrase(); 
        randomVerbPhrase();

    }

}