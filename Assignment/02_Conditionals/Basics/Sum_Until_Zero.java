package Assignments.Basic;

import java.util.Scanner;

public class Sum_Until_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;

        while (true){
            System.out.println("Enter numbers (0 to EXIT)");
            int number=sc.nextInt();
            if (number==0){
                break;
            }sum=sum+number;
        }
        System.out.println(sum);
    }
}
