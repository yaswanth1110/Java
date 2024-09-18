package Assignments.Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int Orignumber=sc.nextInt();
        int number=Orignumber;
        int count=0;
        for (;number>0;number/=10){
            count++;
        }
        int sum=0;
        number=Orignumber;
        while (number>0){
            int rem=number%10;
            sum+=Math.pow(rem,count);
            number/=10;

        }
        System.out.println(sum == Orignumber);
    }
}
