package Assignments.Intermediate;

import java.util.Scanner;

public class Average_N_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int i=0;
        double sum=0;

        while (i<n){
            System.out.println("Enter the number " +(i+1)+ " :");
            int number=sc.nextInt();
            sum+=number;
            i++;
        }
        double ans = sum/n;
        System.out.println(ans);
    }
}
