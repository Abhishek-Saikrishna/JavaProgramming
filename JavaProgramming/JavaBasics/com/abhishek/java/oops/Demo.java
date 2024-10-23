package com.abhishek.java.oops;
class Keyboard
{
    final int keys =100; // final makes a variable become constant
    String color;
    final String type = "Electronic gadget";

    void display()
    {
        System.out.println("The keys are "+keys+"Their color is"+color);
    }
}
public class Demo {
    public static void main(String args[])
    {
        Keyboard keyboard = new Keyboard();
        keyboard.color = "Red";
        System.out.println(keyboard);
    }
}
