
public class Word {

    protected String wordSpelled;
    protected int totalNumberCharacters;
    // private String wordSymbol;
    // private String[] wordMeaning;

    public Word() {
        this("");
    }

    public Word(String wordSpelled) {
        this.wordSpelled = wordSpelled;
        this.setNumberOfCharacters();
    }
    
    protected String printSentence(String str) {
        return str + " Total of words: ";
    }

    public void setNumberOfCharacters() {
        this.totalNumberCharacters = this.wordSpelled.length();
        // return this.wordNumberCharacters;
    }

}