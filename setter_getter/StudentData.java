package org.eclipse.che.setter_getter;

public class StudentData {

    public static void main(String[] args)
    {
        Student s = new Student();
        s.setSno(1);
        s.setSname("Vaishnavi");
        s.setSper(87.0f);
        System.out.println("The student number :"+s.getSno());
        System.out.println("The student name :"+s.getSname());
        System.out.println("The student percentage:"+s.getSper());
    }
}