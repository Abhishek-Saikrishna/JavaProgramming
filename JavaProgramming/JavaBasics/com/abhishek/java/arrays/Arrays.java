package com.abhishek.java.arrays;
class Student
{
    private int rollNo;
    private int classNo;

    public Student(int rollNo, int classNo) {
        this.rollNo = rollNo;
        this.classNo = classNo;
    }

    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", classNo=" + classNo +
                '}';
    }
}
public class Arrays {
    public static void main (String args [])
    {
        int number[] ={1,2,3,4};
        int marks[] = new int[4];
        marks[0] = 96;
        marks[1] = 97;
        marks[2] = 98;
        marks[3] = 99;

        System.out.println("For loop in normal mode");
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]);
        }

        System.out.println("Enhanced for loop");
        for (int n : marks)
        {
            System.out.println(n);
        }

        Student student[] = new Student[4];
        student[0] = new Student(1,7);
        student[1] = new Student(2,6);
        student[2] = new Student(3,5);
        student[3] = new Student(4,4);

        for(Student s: student)
        {
            System.out.println(s);
        }


    }
}
