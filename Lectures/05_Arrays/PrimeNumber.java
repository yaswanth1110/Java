package javafullstack;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int factors=0;

        for (int i = 1; i <= number; i++) {
            int rem=number%i;
            if(rem==0){
                System.out.println("factors "+i);
                factors++;
            }
        }if (factors==2){
            System.out.println(number+ " is prime");
        }else{
            System.out.println(number+" not prime");
        }
    }
}
