package lectures;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        String ans=mygreet(s);
        System.out.println(ans);
    }

    static String mygreet(String name) {
       // name = "yaswanth";
        String s="hello "+name;
        return s;

    }
}
