package yaswanth.assignments;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        int i1=in;
        int rem=0;
        int sum = 0;
        int digit = 0;
        while (i1 != 0) {
            i1 = i1 / 10;
            digit++;
        }

        i1=in;//reassign to i for original value

        while (i1 != 0) {
            rem = i1 % 10;
           // sum = (int) (sum + Math.pow(rem, digit));
            sum+=Math.pow(rem,digit);
            i1 = i1 / 10;
        }
        if (in == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}



//package yaswanth.assignments;
//
//import java.util.Scanner;
//
//public class Armstrong_Number {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        scanner.close();
//
//        int originalNumber = number;
//        int remainder;
//        int result = 0;
//        int digits = 0;
//
//        // Calculate number of digits
//        while (originalNumber != 0) {
//            originalNumber /= 10;
//            digits++;
//        }
//
//        originalNumber = number;
//
//        // Calculate the sum of the power of each digit
//        while (originalNumber != 0) {
//            remainder = originalNumber % 10;
//            result += Math.pow(remainder, digits);
//            originalNumber /= 10;
//        }
//
//        // Check if the number is an Armstrong number
//        if (result == number) {
//            System.out.println(number + " is an Armstrong Number");
//        } else {
//            System.out.println(number + " is not an Armstrong Number");
//        }
//    }
//}




