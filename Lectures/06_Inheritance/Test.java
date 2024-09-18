package com.jfs;

public class Test {
    public static void main(String[] args) {
        Parent p=new Parent(1000,6789.098);
        System.out.println(p.getCode());
        System.out.println(p.getSal());
        System.out.println("------------------");

        Child c=new Child();
        c.setCode(200);
        c.setSal(678.09);
        System.out.println(c.getCode());
        System.out.println(c.getSal());
        System.out.println("------------------");
        c.display();
    }
}
