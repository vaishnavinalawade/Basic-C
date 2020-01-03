package org.eclipse.che.array;

public class Employee_Array
{
    int e_id;
    String e_name;
    double e_sal;
    static int count;

    public Employee_Array()
    {

    }

    public Employee_Array(String name, double sal)
    {
        count++;
        e_id = count;
        e_name = name;
        e_sal = sal;
    }
    public void display()
    {
        System.out.println("Employee Id: "+e_id);
        System.out.println("Employee Name: "+e_name);
        System.out.println("Employee Salary: "+e_sal);
    }
    static int showCount()
    {
        return count;
    }

    public static void main(String[] args)
    {
        Employee_Array e1 = new Employee_Array("Ron", 78000);
        Employee_Array e2 = new Employee_Array("Dan", 90000);
        System.out.println("The number of employees is " +Employee_Array.showCount());
        e1.display();
        e2.display();

    }


}