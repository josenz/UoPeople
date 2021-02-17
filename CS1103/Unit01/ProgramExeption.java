// Part 2:Programming with Exceptions

// In this part of the lab,you will write a program that fetches the information stored 
//  at a given URL on the web and saves that data to a file. This will also include networking 
//  and file operations and partly an exercise in using exceptions.

// For doing I/O, Java has a pair of nice abstractions: InputStream and OutputStream. These are 
//  abstract classes in the package java.io.An InputStream is a place from which you can read 
// data; an OutputStream is a place to which you can write data. For this lab, you will use an 
// InputStream to represent the data read from the Web URL, and you will use an OutputStream 
// to represent the file where you want to save a copy of the data. Once you have the streams,
// the data can be copied just by calling the following method, which you can copy into your program:

// private static void copyStream(InputStream in,OutputStream out)throws IOException{int oneByte=in.read();
    // while(oneByte>=0){  negative value indicates end-of-stream
    // out.write(oneByte);
    // oneByte=in.read();}
    // }

// Aside from this method,you should have a main routine that does the following:

// Declare variables to represent the InputStream and the OutputStream. It would 
// be a good idea to initialize them to null to avoid uninitialized variable errors.

// Read the URL and the file name as strings from the user.

// To connect to the web,you need a variable--say url--of type URL(from package java.io).
// You can create the URL object with the constructor call url=new URL(urlString),where 
// urlString is the string provided by the user.
// This constructor will throw a MalformedURLException if the string is not a legal URL.
// (Note:the string must be a complete URL,beginning with"http://".)

// To get the input stream, you can simply call url.openStream(), which returns a value of 
// type InputStream.This can throw an IOException, for example, if the web address that you 
// are asking for does not exist.

// To get the output stream, you can use the constructor new FileOutputStream(fileName),
// where fileName is the file name that was input by the user.This can throw a FileNotFoundException 
// if it is not possible to open the specified file for reading(for example,if the user is trying to 
// create a new file in a directory where they don'thave write permission).Warning:If a file of the 
// same name already exists,the old file will be erased and replaced by the new one,without giving 
// the user any notice!

// Now,copy the data from the web into the file by calling the above method.Note that this can throw 
// an IOException.

// Finally,use a finally to clause to make sure that both streams are closed(if they were successfully 
// opened).Both InputStream and OutputStream have a close()method for closing the stream.Note that you 
// can test whether the stream was opened by testing whether the value of the variable is still null.Note 
// that an exception should not crash your program.You should catch the exception and print out a reasonable 
// error message before ending the program.It would be nice if the error message depends on the type of error 
// that occurred(which means using several catch clauses).