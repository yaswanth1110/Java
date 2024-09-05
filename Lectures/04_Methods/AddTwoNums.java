package lectures;

import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st number ");
        int num1=sc.nextInt();
        System.out.println("enter 2nd number ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is :"+ sum);
    }
}
