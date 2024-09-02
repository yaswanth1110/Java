package yaswanth.assignments;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Principle :");
        int principle=s.nextInt();

        System.out.print("Rate of intrest :");
        int rate_of_interest=s.nextInt();

        System.out.print("Time :");
        int time=s.nextInt();

//        System.out.println("Principle Amount " +principle);
//        System.out.println("Rate of Interest " +rate_of_interest);
//        System.out.println("Time " +time);
        System.out.println("simple interest = " +(principle*rate_of_interest*time)/100);



    }




}
