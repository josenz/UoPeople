import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A program to demo the FileNotFoundException The exception is handled using a
 * try-catch block
 * 
 * @author Tien Nguyen
 */
public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("not_found.txt");
            Scanner scanner = new Scanner(file);
            // processing file...
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        }
    }
}