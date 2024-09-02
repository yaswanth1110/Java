package Assignments.Basic;

import java.util.Scanner;

public class Circle_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
