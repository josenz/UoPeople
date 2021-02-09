// Discuss the concept of parameters. What are parameters for? 
    // Parameter are the bridge that interconect the outern scope of 
    // a method to its inner implementation (code). Parameters work 
    // like an interface where we can change the implementation inside the
    // method without having to know how it works and at the same time 
    // keeping the behavior of the method unchangeable. 

// What is the difference between formal parameters (parameters) 
// and actual parameters (arguments)? 
            
    // The difference between formal parameters and actual parameters 
    // is that a formal parameter also known as dummy parameter or just as 
    // parameter is used when we assign a method with one or more 'interfaces',
    // it can be seen as a variable which brings some data to be used inside the method.

    // On the other hand, actual parameter also known as argument is the value that
    // we use between parentheses when calling a method instruction. Its value must 
    // be the same type of the formal parameter declared at the method assignment. 
        
// Give an example in Java code that illustrates formal parameters 
// and actual parameters:

public class Discussion {

    public static void main(String[] args) {

        String name = "Jose";
        int age = 36;
        double height = 1.75;
        // Actual parameters also known as arguments:
        printDataFromUser(name, age, height); 

    }

    // Formal parameters also known as parameters:
    static void printDataFromUser(String name, int age, double height) {

        System.out.println("User's name is: " + name);
        System.out.println("User's age is: " + age + " years old");
        System.out.println("User's height is: " + height + " cm");
    }
}