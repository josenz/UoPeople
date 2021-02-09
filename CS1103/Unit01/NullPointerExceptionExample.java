/**
 * A class represents a person
 * 
 * @author Tien Nguyen
 */
class Person {
    public String name;
    public int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(this.name + " is speaking...");
    }
}

/**
 * A program to demo handling NullPointerException that the exception is handled
 * by checking whether the object is null
 * 
 * @author Tien Nguyen
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Person john = new Person("John", 29);
        // in some other parts of the code, john is set to null
        // this is for demo only
        john = null;
        // handle the NullPointerException by using the try-catch block
        try {
            john.speak();
        } catch (NullPointerException ex) {
            System.out.println("John is null");
            ex.printStackTrace();
        }
    }
}