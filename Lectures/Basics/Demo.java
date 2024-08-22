package yaswanth.reddy1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
      //  System.out.println("hi....");
        Scanner input= new Scanner(System.in);
        System.out.println("your roll no is " + input.nextBigDecimal()); //for printing the entire line
        System.out.println(input.next()); // for the next token
        System.out.println(input.nextInt());// for integer
    }
}
