package Assignments.Basic;

import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();

        int product=1;
        int sum=0;

        while (num>0){
            int digit=num%10;
            product=product*digit;
            sum+=digit;
            num/=10;
        }
        int result=product-sum;
        System.out.println(result);
    }
}
