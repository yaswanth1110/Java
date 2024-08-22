package yaswanth.reddy1;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // float f=input.nextFloat();
        //---- Type Conversion=byte ->short ->char ->int ->long ->float ->double
        // Type Conversion(widening conversion)---->(implicit)compatible types, destination type should be greater than source type.
//        int i=input.nextInt();
//        System.out.println(i);


        //----Type Casting(explicit)=double ->float ->long ->int ->char ->short ->byte
//        float f=input.nextFloat();
//        int i=(int)f;
//        System.out.println(i);


        //----Automatic type promotion in expressions
//        int i=895,j=896;
//        byte b=(byte)i;//byte range =-128 to 127
//        byte c=(byte)j;
//        System.out.println(b);
//        System.out.println(c);


//        byte b=20;
//        byte b1=50;
//        byte b2=100;
//        int i=b1*b/b2;//20*50==1000 cannot be stored in byte
//        //even a,b are bytes
//        //in this kind of problem automatic promotion is done byte to int when evaluating  expression
//        System.out.println(i);

//        byte b3=70;
//        b3=b3*80;// int cannot be allocated to byte
//        //type casting should be done or b3 should be int
//        System.out.println(b3);

//        int num='c';
//        System.out.println(num);//ASCII value of a will be printed, Java follows UNICODE principles

        System.out.println(3*6.33);
        byte b=40;
        char c='b';
        short s=1000;
        int i=90;
        float f=9.0001f;
        long l=987654;
        double d=2.43567;
        float result=(f*l)+(c/s)-(i+s);
        //float,char,int results in float
        System.out.println((f*l)+" "+(c/s)+" "+(i+s));
        System.out.println(result);
        System.out.println((c/s));

    }
}
