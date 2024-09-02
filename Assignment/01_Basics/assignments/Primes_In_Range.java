package yaswanth.assignments;

import java.util.Scanner;

public class Primes_In_Range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();

        int num2=sc.nextInt();

        for (int num = num1; num <=num2 ; num++) {
            if(num<=1){
                continue;
            } else if (num==2) {
                System.out.println(num + "is the only even prime number");

            }else {
                int i;
                for ( i = 2; i <=Math.sqrt(num) ; i++) {
                    if (num%i==0){
                        break;
                    }

                }if (i>Math.sqrt(num)){
                    System.out.println(num);
                }
            }

        }
    }
}
