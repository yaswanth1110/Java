package com.jfs;

public class Parent {
    private int code;
    private double sal;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Parent() {
    }

    public Parent(int code, double sal) {
        this.code = code;
        this.sal = sal;
    }

    public static void main(String[] args) {
        Parent p=new Parent(100,789.987);
        System.out.println(p.getCode()+ " " + p.getSal());
    }
    public  void display(){
        System.out.println("hi im yaswanth");
    }
}
