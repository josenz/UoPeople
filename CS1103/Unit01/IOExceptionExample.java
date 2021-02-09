import java.io.FileWriter;
import java.io.IOException;

/**
 * A program to demo the IOException The exception is handled by declaring the
 * throws keyword in the method definition
 * 
 * @author Tien Nguyen
 */
public class IOExceptionExample {
    public static void main(String[] args) {
        // handle the exception from the throwIOException method
        try {
            throwIOException();
        } catch (IOException ex) {
            System.out.println("An IO exception occurred.");
            ex.printStackTrace();
        }
    }

    /**
     * A method that intends to throw an IOException and let the code using it
     * handle the exception
     * 
     * @throws IOException An IO exception occurred
     */
    public static void throwIOException() throws IOException {
        // try to write to a file that the current user has no write permission
        FileWriter fileWriter = new FileWriter("/etc/hosts");
        fileWriter.write("This is a line of text.");
        fileWriter.close();
    }
}

// OUTPUT -> An IO exception occurred.
        // java.io.FileNotFoundException:/etc/hosts (Permission denied)
        //         at java.base/java.io.FileOutputStream.open0(Native Method)
        //         at java.base/java.io.FileOutputStream.open(FileOutputStream.java:291)
        //         at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:234)
        //         at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:123)
        //         at java.base/java.io.FileWriter.<init>(FileWriter.java:66)
        //         at IOExceptionExample.throwIOException(IOExceptionExample.java:29)
        //         at IOExceptionExample.main(IOExceptionExample.java:14)