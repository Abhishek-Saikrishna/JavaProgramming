package com.abhishek.java.threads;
class A implements Runnable
{
    public void run()
    {
        for (int i=0 ; i<10 ;i++) {
            System.out.println("Hello in class A");
            try {
                Thread.sleep(410);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        for (int i=0 ; i<10 ;i++) {
            System.out.println("Hello in class B");
            try {
                Thread.sleep(410);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class DemoThread {
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.setPriority(10);
        t1.start();
        t2.start();
        System.out.println("Hello in main");
    }
}
