package com.abhishek.java.packages.secondary;

import com.abhishek.java.packages.primary.A;

public class B {
    int number = 2;
    public void show()
    {
        System.out.println("Show for B.java");
    }

    public static void main(String args[])
    {
        A a= new A();
        a.show();
        System.out.println(a.number);
    }

}
