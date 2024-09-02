package Assignments.Basic;

import java.util.Scanner;

public class Rhombus_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagonal 1 length:");
        double d1 = sc.nextDouble();
        System.out.println("Enter diagonal 2 length:");
        double d2 = sc.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.println("Area of Rhombus: " + area);
    }
}
