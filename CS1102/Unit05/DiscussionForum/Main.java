import textio.TextIO;

public class Main {

    public static void main(String[] args) {
        String str;
        System.out.println("Write a sentence:");
        str = TextIO.getln();
        Sentence sentence = new Sentence(str);
        // sentence.printSentence();
        sentence.printObjectWord();
        System.out.println(sentence.printSentence());
    }
}

