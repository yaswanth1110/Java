package yaswanth.assignments;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int lower=s.nextInt();
        int higher=s.nextInt();
       // int n=s.nextInt();
        int first=0,second=1,next,i=1;

        //FIBONACCI NUMBERS BETWEEN THE RANGE
        //WHILE LOOP
//        while(i<=higher){
//            if(i>=lower){
//                    System.out.print(first + " ");
//            }
//            next=first+second;
//            first=second;
//            second=next;
//            i++;
//
//        }

        //FOR LOOP

        for(i=lower;i<=higher;i++){
            System.out.print(first + " ");
            next=first+second;
            first=second;
            second=next;
        }

        //FIBONACCI NUMBERS
//        while(i<=n){
//            System.out.print(first + ""); //Numbers upto nth fibonacci number
//            next=first+second;
//            first=second;
//            second=next;
//            i++;
          //  System.out.print(first + " ");
        //System.out.print(first + ""); //nth fibbonacci

    }
}
