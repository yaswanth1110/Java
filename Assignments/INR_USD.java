package yaswanth.assignments;

import java.util.Scanner;

public class INR_USD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter INR : ");
        double d=s.nextDouble();

        double d1=d*83.87;

        System.out.println("USD= "+d1);
    }
}
