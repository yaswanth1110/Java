package Assignments.Intermediate;

import java.util.Scanner;

public class Negative_PositiveOdd_PositiveEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nNum=0;
        int pOdd=0;
        int pEven=0;

        while(true){
            System.out.println("Enter number :");
            int number=sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number<0){
                nNum+=number;
            } else if (number%2==0) {
                pEven+=number;
            }else {
                pOdd+=number;
            }
        }
        System.out.println(nNum);
        System.out.println(pOdd);
        System.out.println(pEven);
    }
}
