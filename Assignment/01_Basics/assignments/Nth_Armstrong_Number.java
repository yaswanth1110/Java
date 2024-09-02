package yaswanth.assignments;

import java.util.Scanner;

public class Nth_Armstrong_Number {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter lower limit: ");
        int lower=s.nextInt();

        System.out.println("Enter upper limit: ");
        int upper=s.nextInt();

        int rem,digit=0,sum=0;

        for(int num=lower;num<=upper;num++){
            int onum=num;
            digit=0;
            sum=0;

            while(onum!=0){    //number of digits in a number
                onum= onum/10;
                digit++;

            }
            onum=num;
            while (onum != 0) {
                rem = onum % 10; // Get the last digit
                sum += Math.pow(rem, digit);
                onum /= 10; // Remove the last digit
            }
            if(sum==num){
                System.out.print(num + " ");
//            }else{
//                System.out.println(num + "is not an Armstrong Number");
            }
        }

    }
}
