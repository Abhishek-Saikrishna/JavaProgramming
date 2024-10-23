package com.abhishek.java.exceptions;

public class ExceptionHandling {

    public static void main(String args[])
    {
        int i = 4;
        int j = 4;
        int result = 0;

        try {
            result = i / j;
            System.out.println("The result is " + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("the exception is "+e.getClass());
        }
        finally {
            System.out.println("This is common statement");
        }
    }
}
