package ExceptionPrograms;

import java.io.IOException;

public class throwsKeyword {
    public static void main(String[] args) {
        try {
            testMethod();   // method that declares "throws"
        } catch (IOException e) {
            System.out.println("⚠ Exception handled: " + e.getMessage());
        }
    }

    // Method declaring exception with "throws"
    static void testMethod() throws IOException {
        throw new IOException("This is an IOException example.");
    }
}


//output 
//⚠ Exception handled: This is an IOException example.
