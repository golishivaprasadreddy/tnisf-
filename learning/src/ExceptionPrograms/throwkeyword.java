package ExceptionPrograms;

public class throwkeyword {
    public static void main(String[] args) {
        try {
            // calling method that uses throw
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("⚠ Exception caught: " + e.getMessage());
        }

        try {
            checkAge(20);
        } catch (ArithmeticException e) {
            System.out.println("⚠ Exception caught: " + e.getMessage());
        }
    }

    // Method with throw
    static void checkAge(int age) {
        if (age < 18) {
            // explicitly throwing an exception
            throw new ArithmeticException("Age must be at least 18 to vote.");
        } else {
            System.out.println("✅ Age is valid. You can vote!");
        }
    }
}

//output
//⚠ Exception caught: Age must be at least 18 to vote.
//✅ Age is valid. You can vote!
