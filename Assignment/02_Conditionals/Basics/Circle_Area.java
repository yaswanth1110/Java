package Assignments.Basic;

import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        double rad=sc.nextDouble();
        double area=3.142*rad*rad;
        System.out.println(area);

    }
}
