package com.yaswanth;

import java.util.Scanner;
class EvenNumberOfDigits1295 {
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int element=nums[i];
            int noofdigits=0;
            while(element!=0){
                // element=element/10;
                element= (int)(Math.log10(element)) + 1;
                noofdigits++;
            }

            if(noofdigits%2==0){
                count++;
            }
        }return count;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] nums=new int[number];
        for (int i = 0; i < number; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findNumbers(nums));
    }
}