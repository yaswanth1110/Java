package lectures;

public class Shadowing {
    static int a=90; //shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a);
        int a;
//        System.out.println(a);  //scoping will begin when value is initialized.
        a=40;
        System.out.println(a);
        fun();;
    }

    static void fun(){
        System.out.println(a);
    }
}
