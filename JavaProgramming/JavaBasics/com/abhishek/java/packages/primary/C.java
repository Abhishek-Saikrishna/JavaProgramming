package com.abhishek.java.packages.primary;

public class C {
    int number = 3;
    public void show()
    {
        System.out.println("Show for C.java");
    }
    public static void main(String args[])
    {
        A a= new A();
        a.show();
        System.out.println(a.number);
    }
}
