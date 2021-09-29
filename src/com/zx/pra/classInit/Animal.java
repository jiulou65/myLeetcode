package com.zx.pra.classInit;

public class Animal {
    private int i = test();
    private static int j  = method();
    static {
        System.out.println("a");
    }
    Animal(){
        System.out.println("b");
    }
    {
        System.out.println("c");
    }
    public int test(){
        System.out.println("d");
        return 1;
    }
    public static int method(){
        System.out.println("e");
        return 1;
    }
}
