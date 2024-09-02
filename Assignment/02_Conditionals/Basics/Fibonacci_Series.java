package Assignments.Basic;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=0;
        int second=1;
        int num=sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;


        }
    }
}
