// An object is created by a class. "Objects are
 //  created and destroyed as the program runs, and there 
 //  can be many objects with the same structure, if they
 //  are created using the same class." Eck(2019, p. 202)

 // So as we can see, the object is a product of a class, and 
 // it has properties and methods described by the class which 
 // can also be seemed as templates for the object.

//  The object was created inside the main method.
 public class MainProgram {
 
    public static void main(String[] args) {
        
        Word happy = new Word("happy"); // The Object 'happy' is created by the guides of the Class 'Word'.
        happy.printWord();
        happy.wordSpelled = "HAPPY";

        Word sad = happy;
        //sad.wordSpelled = "sad"; // -> We can access if wordSpelled declaration was -> "static" String wordSpelled;

        // happy.printWord();
        sad.printWord();

        System.out.println((int)Math.random()*6);

    } 

 }