package Assignments.Basic;

import java.util.Scanner;

public class Parallelogram_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base length:");
        double base = sc.nextDouble();
        System.out.println("Enter side length:");
        double side = sc.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("Perimeter of Parallelogram: " + perimeter);
    }
}