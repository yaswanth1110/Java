package yaswanth.assignments;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("First number : ");
        int i=s.nextInt();

        System.out.println("Second number : ");
        int i1=s.nextInt();

        if(i>i1){
            System.out.println("Greatest number is "+i);
        }
        else if (i1>i){
            System.out.println("Greatest number is "+i1);
        }
        else{
            System.out.println("Both are Equal");
        }

    }
}
