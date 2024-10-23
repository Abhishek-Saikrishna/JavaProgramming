package com.abhishek.java.oops;
public class Constructor {
    /* Making the variables private and providing them
    access through the getters and setter is called  Encapsulation*/
    private int value;
    private String type;


    public Constructor(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "value=" + value +
                ", Type='" +type+ '\'' +
                '}';
    }
}

class ConstructorMain
{
    public static void main(String args[])
    {
        Constructor constructorObject = new Constructor(25,"silver Jubliee");
        System.out.println(constructorObject.toString());
        constructorObject.setValue(100);
        constructorObject.setType("Century");
        System.out.println(constructorObject.toString());
    }
}