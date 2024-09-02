package yaswanth.assignments;

import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.next;

public class Value_Based_on_Operator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        double i=s.nextDouble();

        System.out.println("Enter 2nd Number : ");
        double i1=s.nextDouble();

        System.out.println("Enter + or - or * or /");
        char c=s.next().charAt(0); //only next() give the string but here we want the character

        double result=0;//double result;

        if(c=='+'){
            result=i+i1;
        }
        else if (c=='-'){
            result=i-i1;
        }
        else if (c=='*'){
            result=i*i1;
        }
        else if (c=='/'){
            if (i1!=0){
                result=i/i1;
            }
            else {
                System.out.println("cannot be divide by 0");
//                return;
            }
        }
        else {
            System.out.println("Invalid");
//            return;
        }
        System.out.println("result= " +result);
    }
}


//package yaswanth.assignments;
//import java.util.Scanner;
//
//public class Value_Based_on_Operator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Enter second number: ");
//        double num2 = scanner.nextDouble();
//
//        System.out.print("Enter an operator (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);
//
//        double result;
//
//        if (operator == '+') {
//            result = num1 + num2;
//        } else if (operator == '-') {
//            result = num1 - num2;
//        } else if (operator == '*') {
//            result = num1 * num2;
//        } else if (operator == '/') {
//            if (num2 != 0) {
//                result = num1 / num2;
//            } else {
//                System.out.println("Cannot divide by zero.");
//                return;
//            }
//        } else {
//            System.out.println("Invalid operator.");
//            return;
//        }
//
//        System.out.println("The result is: " + result);
//    }
//}
