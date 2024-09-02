package Assignments.Basic;

import java.util.Scanner;

public class Largest_Until_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=0;

        while (true) {
            System.out.println("Enter numbers (0 to EXIT)");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            } else {
                if (number > largest) {
                    largest = number;
                }
            }
        }
        System.out.println(largest);
    }
}
