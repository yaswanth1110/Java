package yaswanth.assignments;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num<=1){
            System.out.println(num + "Not a Prime Number");
            return;
        }
        else if(num==2){
            System.out.println(num+ "is the only even prime number");
            return;

        }
        else{
            for (int i = 3; i <=Math.sqrt(num) ; i++) {
                if(num%i==0) {
                    System.out.println(num + "Not a Prime Number");
                    return;
                }

            }
        }
        System.out.println(num + "is a Prime Number");

    }
}
