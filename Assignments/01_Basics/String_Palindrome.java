package yaswanth.assignments;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str=s.next();
       // String str1=str;
        
        String reversestr="";

        for (int i = 0; i < str.length(); i++) {
            reversestr=str.charAt(i) + reversestr;
            
        }
        if(str.equals(reversestr)){
            System.out.println(str+ " is a palindrome");
        }
        else{
            System.out.println(str+ " is not a palindrome");
        }
    }
}
