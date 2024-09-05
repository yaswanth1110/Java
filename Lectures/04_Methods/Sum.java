package lectures;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

      //  add1();
//        int ans= add1();
//        System.out.println(ans);

        int ans= sum3(2,3);
        System.out.println(ans);

    }

    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }

    //return the value

    static int add1(){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st number ");
        int num1=sc.nextInt();
        System.out.println("enter 2nd number ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;
    }


    static void add(){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st number ");
        int num1=sc.nextInt();
        System.out.println("enter 2nd number ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is :"+ sum);
    }

    /* access modifier return_type name()*/
}
