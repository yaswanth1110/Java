package Assignments.Basic;

import java.util.Scanner;

public class Equilateral_Triangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side length:");
        double side = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}
