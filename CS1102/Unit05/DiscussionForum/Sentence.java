
public class Sentence extends Word{

    private String sentence;
    private String[] str;
    private Word[] word;

    public Sentence(String sentence) {
        super("");
        this.sentence = sentence;
        this.str = sentence.split("\\s+");
        this.initializeObjectWord();
    }

    public void initializeObjectWord() {
        word = new Word[this.str.length];
        for (int i = 0; i < this.str.length; i++) {
            word[i] = new Word(this.str[i]);
            // System.out.println(word[i].wordSpelled + " : " 
                            // + word[i].totalNumberCharacters);
        }
    }

    public String printSentence() {
        String completeSentence = super.printSentence(this.sentence);
        return completeSentence + this.str.length;
    }

    public void printObjectWord() {
         System.out.println(word.toString());
    }

    // public void printSentence() {
        // System.out.println(this.str);
    //     System.out.println("this");
    // }

    
}


   