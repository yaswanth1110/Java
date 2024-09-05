package lectures;

public class Scope {
    public static void main(String[] args) {
        int a=19;
        int b=90;

        {
           // int a=78;  //alraedy initialized outside the block in the same method
            a=99;//reassign the original rev var with some other value
            System.out.println(a);//99
            int c=99;
            //values initialized in this block remain in this block only
        }System.out.println(a);//99
        int c=99;

        //System.out.println(c); // not valid //block scope

//        System.out.println(num);//num can not be accessed here.//method scoping
//        System.out.println(marks);//method scope

    }

    //scoping in for loopa



    static void method(int marks){
        int num=89;
        System.out.println(num);

        for(int i=0;i<0;i++){
            System.out.println(i);
        }
        //System.out.println(i);
        int c=99;
    }
}
