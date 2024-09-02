package Assignments.Intermediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String revstr="";

        for (int i = 0; i < str.length(); i++) {
            revstr=str.charAt(i) + revstr;

        }
        System.out.println(str.equals(revstr));
    }
}
