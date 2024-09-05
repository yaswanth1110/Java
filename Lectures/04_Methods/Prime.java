package lectures;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean isprime=prime(number);
        System.out.println(isprime);

    }

    static boolean prime(int n){
        if(n<=0){
            return false;
        }
        int factors=0;
        for (int i = 2; i <=n/2 ; i++) {
            int rem=n%i;
            if(rem==0){
                factors++;
            }

        }return factors==0;
    }
}
