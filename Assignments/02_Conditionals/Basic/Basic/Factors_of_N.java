package Assignments.Basic;

import java.util.Scanner;

public class Factors_of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       // int factors=0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i+" ");
               // factors ++;
            }

        }//System.out.println(factors);
    }
}
