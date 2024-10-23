package com.abhishek.java.abstractClasses;
/* abstract classes are useful for implementing
abstraction layer. It is helpful for Loose Coupling.
abstract classes contains abstract and non-abstract
methods. abstract methods doesn't have implementation and
declared with public abstract and the class should be declared abstract before it
Non-abstract methods are normal methods.
*/
interface Computers
{
    int price = 3000; // we can create the varaiables but they are final by default
    String config();
    // you can implement a method in interface by specifying its type s default
}
class DesktopClass implements Computers
{
    public String  config()
    {
        return "Desktop Configuration";
    }
}
class LaptopClass implements Computers
{
    public String config()
    {
        return "Laptop Configuration";
    }
}
class DevClass
{
    public DevClass() {
    }

    void work(Computers computers)
    {
        System.out.println("Developer Interface is coding with "+computers.config());
    }
}
public class Interface {
    public static void main(String args[]) {
        Computers computer1 = new LaptopClass();
        Computers computer2 = new DesktopClass();
        DevClass devClass = new DevClass();
        devClass.work(computer1);
        devClass.work(computer2);
    }
}
