package lectures;

import java.util.Arrays;

public class VarArgs {//var len args
    public static void main(String[] args) {
       fun(1,2,3,3,4,5,5,6,6,4,3,2,22);
       //fun();//empty array
        multipleargs(2,34,"sdfghj","dfghjk");
    }

    static void multipleargs(int a, int b, String ...y){
        System.out.println();

    }


    static void fun(int ...y){
        System.out.println(Arrays.toString(y));
    }
}
