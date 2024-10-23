package com.abhishek.java.oops;

class Keyboards
{
    int keys;
    String color;

    public Keyboards() {
    }

    public Keyboards(int keys, String color) {
        this.keys = keys;
        this.color = color;
    }

    final String type = "Electronic gadget";

    void display()
    {
        System.out.println("The keys are "+keys+"Their color is"+color);
    }
}

class AdvancedKeyboard extends Keyboards
{
    void display()
    {
        System.out.println("I am displaying the Advanced Keyboard Values");
    }

    void display(int a ,int b)
    {
        System.out.println("This is the example for Method overloading"+a+b);
    }

    void show()
    {
        System.out.println("This method is for the Advanced keyboard class");
    }

}

public class Inheritence {
    public static void main(String args[])
    {
        /*Can create an object of child class
        with parent class type*/
        Keyboards keyboards = new AdvancedKeyboard();
        keyboards.display();// Method overriding
        AdvancedKeyboard advancedKeyboard = new AdvancedKeyboard();
        advancedKeyboard.show();
    }
}
