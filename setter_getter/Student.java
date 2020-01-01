package org.eclipse.che.setter_getter;

public class Student
{
    int sno;
    String sname;
    float sper;

    public void setSno(int no)
    {
        sno = no;
    }
    public void setSname(String name)
    {
        sname = name;
    }
    public void setSper(float per)
    {
        sper = per;
    }
    public int getSno()
    {
        return sno;
    }
    public String getSname()
    {
        return sname;
    }
    public float getSper()
    {
        return sper;
    }

}