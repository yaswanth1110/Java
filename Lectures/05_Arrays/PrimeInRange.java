package javafullstack;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int lower=sc.nextInt();
        int higher=sc.nextInt();
        int count=0;



        for (int i = lower; i <=higher ; i++) {
            if (i==2){
                System.out.println(i+ "is the only prime");

            }
            int factors=0;
            for (int k = 1; k <=i ; k++) {
                int rem=i%k;
                if(rem==0){
                    factors++;
                    }

                }if (factors==2){

                count++;

//                System.out.println(i+" prime" );
//            }else {
//                System.out.println(i+ "not prime");
            }


        }System.out.println(count);
    }
}
