/**
 * Give an example of a class and an example of an object. 
 * Describe what a class is, what an object is, and how they are related. 
 * Use your examples to illustrate the descriptions.
 */

 // Honesttly, it is quite hard to explain and describe what 
 //  a class and an object are because their concepts are 
//   not so easy to explain in plenty English. Of course, 
//   everyone might have heard or read that a class is like 
//   a blueprint for constructing objects that will have the same properties 
//   and methods but I think that analogy is not that so easy 
//   to understand when we start seeing modifiers like static, final,
//   private etc... that somehow block the properties and methods 
//   of beeing accessed directly from the object created. 

// So I see a class as a way of keeping things organised 
//   that when written using correct patters and terminologies 
//   can make the program more stable, easy to maintaing and reusable.

// Example of a Class:
public class Word {

    // "The non-static parts of the class specify, or describe,
    //   what variables and methods the objects will contain." Eck(2019, p. 202)
    
     //static String wordSpelled; // -> We can accesss by this line -> sad.wordSpelled = "sad";
     static String wordSpelled; // -> We cannot accesss by this line -> sad.wordSpelled = "sad"; 

     static int numberOfCharacters;
     String meaningOfTheWord;
     String typeOfTheWord;

     public Word(String word) {

        wordSpelled = word;
        
     }

      //public static void printWord() { //-> Only works when the variable is declared as static -> "static" String wordSpelled;
      public void printWord() {

      
        System.out.println(wordSpelled);

      //   System.out.println(this.wordSpelled);
      
     }

}

 

