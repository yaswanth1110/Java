package yaswanth.assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int i=s.nextInt();
        int n=i;
        int rev=0,rem=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;

        }
        if(i==rev){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    }



