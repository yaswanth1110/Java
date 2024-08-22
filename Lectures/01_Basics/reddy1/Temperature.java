package yaswanth.reddy1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float C=in.nextFloat();
        float F=(C*9/5)+32;
        System.out.println(F);
    }
}
