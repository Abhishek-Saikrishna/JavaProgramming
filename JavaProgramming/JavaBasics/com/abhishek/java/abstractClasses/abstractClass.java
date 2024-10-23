package com.abhishek.java.abstractClasses;
/* abstract classes are useful for implementing
abstraction layer. It is helpful for Loose Coupling.
abstract classes contains abstract and non-abstract
methods. abstract methods doesn't have implementation and
declared with public abstract and the class should be declared abstract before it
Non-abstract methods are normal methods.
*/
abstract  class Computer
{
    public abstract String config();
}
class Desktop extends Computer
{
    public String  config()
    {
        return "Desktop Configuration";
    }
}
class Laptop extends Computer
{
    public String config()
    {
        return "Laptop Configuration";
    }
}
class Dev
{
    public Dev() {
    }

    void work(Computer computer)
    {
        System.out.println("Developer is coding with "+computer.config());
    }
}
public class abstractClass {
    public static void main(String args[]) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Dev dev = new Dev();
        dev.work(laptop);
        dev.work(desktop);
    }
}
