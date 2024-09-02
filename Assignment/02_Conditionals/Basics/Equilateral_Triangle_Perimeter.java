package Assignments.Basic;

import java.util.Scanner;

public class Equilateral_Triangle_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side length:");
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle: " + perimeter);
    }
}
