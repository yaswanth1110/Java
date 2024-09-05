package lectures;

public class Swap {
    public static void main(String[] args) {
       // int a=9,b=10;
        swap(9,3);
       // System.out.println();

        String name="yaswanth";
        changename(name);
        System.out.println(name);

    }

    static void changename(String name) {
        name="rahul";
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }

}
