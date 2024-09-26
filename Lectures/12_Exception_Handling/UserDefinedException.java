import java.util.Scanner;

// Custom Exception Class
class NuvvuChinnaPillavadivi extends Exception {
    // Constructor
    NuvvuChinnaPillavadivi(String message) {
        super(message); // Call to the parent Exception class with the message
    }
}

public class UserDefinedException {

    // Method to check voting eligibility
    void vote(int age) throws NuvvuChinnaPillavadivi {
        if (age < 18) {
            throw new NuvvuChinnaPillavadivi("Age not sufficient!"); // Throw custom exception
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        UserDefinedException obj = new UserDefinedException();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            obj.vote(age); // Call the vote method
        } catch (NuvvuChinnaPillavadivi e) {
            System.out.println(e.getMessage()); // Print custom exception message
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution finished. Thank you!");
            scanner.close(); // Ensure the scanner is closed
        }
    }
}