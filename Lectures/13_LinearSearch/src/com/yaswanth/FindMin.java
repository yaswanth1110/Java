package com.yaswanth;

import java.util.Scanner;

public class FindMin {
    public static int min(int [] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }return min;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] arr=new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int ans=min(arr);
        System.out.println(ans);
    }
}






//package com.kunal;
//
//public class FindMin {
//    public static void main(String[] args) {
//        int[] arr = {18, 12, 7, 3, 14, 28};
//        System.out.println(min(arr));
//    }
//
//    // assume arr.length != 0
//    // return the minimum value in the array
//    static int min(int[] arr) {
//        int ans = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < ans) {
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }
//
//
//}