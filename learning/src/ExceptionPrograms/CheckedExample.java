package ExceptionPrograms;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("nonexistent.txt"); // File may not exist
            System.out.println("File opened successfully!");
        } catch (IOException e) {
            System.out.println("⚠ Checked Exception caught: " + e.getMessage());
        }
    }
}

//output
//
//⚠ Checked Exception caught: nonexistent.txt (The system cannot find the file specified)

//
//Checked Exceptions include:
//
//IOException (and subclasses like FileNotFoundException)
//
//SQLException
//
//ClassNotFoundException
//
//InstantiationException
//
//IllegalAccessException
//
//NoSuchMethodException
//
//InvocationTargetException
//
//InterruptedException
//
//ParseException
//
//MalformedURLException
//
//TimeoutException