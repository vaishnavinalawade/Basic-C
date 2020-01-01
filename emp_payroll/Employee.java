package org.eclipse.che.emp_payroll;

public class Employee
{
    int emp_id;
    String emp_name;
    double basic_sal;
    double hra;
    double med;
    double pf;
    double pt;
    double net_sal;
    double gross_sal;

    public Employee()
    {
        emp_id = 0;
        emp_name = null;
        basic_sal = 0.0;
    }
    public Employee(int id, String name, double sal)
    {
        emp_id = id;
        emp_name = name;
        basic_sal = sal;
    }
    public void display()
    {
        hra = 0.5*basic_sal;
        pf = 0.12*basic_sal;
        pt = 200;
        med = 0.02*basic_sal;

        gross_sal = basic_sal+hra+med;
        net_sal = gross_sal-(pt+pf);

        System.out.println("Employee Id:"+emp_id+" Employee Name:"+emp_name);
        System.out.println("Payroll");
        System.out.println("Basic Salary:"+basic_sal+" Gross Salary:"+gross_sal+" Net Salary:"+net_sal);

    }


}