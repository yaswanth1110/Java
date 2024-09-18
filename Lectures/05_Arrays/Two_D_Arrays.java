package arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Arrays {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[][] arr=new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <3; col++) {
                arr[row][col]=sc.nextInt();

            }

        }
        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr(row)));
            for (int col = 0; col <3; col++) {
                System.out.print(arr[row][col]+" ");

            }
            System.out.println(" ");

        }
    }
}
