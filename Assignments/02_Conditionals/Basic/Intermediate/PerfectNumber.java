package Assignments.Intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pNumber=sc.nextInt();
        int sum=0;

        for (int i = 1; i <= pNumber/2; i++) {
            if (pNumber%i==0){
                sum+=i;
            }
        }
        System.out.println(sum==pNumber);
    }
}
