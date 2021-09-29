package com.zx.pra.classInit;

public class Dog extends Animal{
    {
        System.out.println("h");
    }
    private int i = test();
    static {
        System.out.println("f");
    }
    private static int j  = method();

    Dog(){
        System.out.println("g");
    }
    public int test(){
        System.out.println("i");
        return 1;
    }
    public static int method(){
        System.out.println("j");
        return 1;
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println();
        Dog dog1 = new Dog();
    }
}