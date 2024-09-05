package lectures;

public class ScopingExample {
    public static void main(String[] args) {
        int a = 19; // Method scope for `a`
        int b = 90; // Method scope for `b`

        // Start of a block
        {
            // Cannot declare `a` again in this block because it is already declared in the method scope
            // int a = 78; // This line would cause a compile-time error

            a = 99; // Reassigning the original `a`
            System.out.println("Value of a inside the block: " + a); // Output: 99

            int c = 99; // Block scope for `c`
            System.out.println("Value of c inside the block: " + c); // Output: 99
        } // End of block

        System.out.println("Value of a outside the block: " + a); // Output: 99

        // Uncommenting the following line will cause a compile-time error because `c` is not in scope here
        // System.out.println("Value of c outside the block: " + c); // Compile-time error

        method(85); // Call to the method to demonstrate method scope and loop scope
    }

    // Method scope for `marks` and `num`
    static void method(int marks) {
        int num = 89; // Method scope for `num`
        System.out.println("Value of num in method: " + num); // Output: 89

        // Start of a for loop
        for (int i = 0; i < 5; i++) { // Loop scope for `i`
            System.out.println("Value of i in loop: " + i); // Output: 0, 1, 2, 3, 4
        } // End of for loop

        // Uncommenting the following line will cause a compile-time error because `i` is not in scope here
        // System.out.println("Value of i outside the loop: " + i); // Compile-time error

        int c = 99; // Block scope for `c` within the method
        System.out.println("Value of c in method: " + c); // Output: 99
    }
}
