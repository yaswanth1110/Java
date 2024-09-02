package Assignments.Basic;

import java.util.Scanner;

public class Isosceles_Triangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base length:");
        double base = sc.nextDouble();
        System.out.println("Enter height:");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of Isosceles Triangle: " + area);
    }
}
