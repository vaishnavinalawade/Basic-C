package org.eclipse.che.examples;

public class MathClass
{

    public int add(int num1, int num2)
    {
       // int res = num1+num2;
        return num1+num2;
    }
    public void add(int... x)
    {
        int result = 0;
        for(int i:x)
        {
            result = result + i;
        }
        System.out.println("Addition of integers is "+result);
    }

    public void add(float num1, float num2)
    {
        float res1 = num1 + num2;
        System.out.println("Addition of float point numbers is "+res1);
    }

    public String add(String str1, String str2)
    {
        return str1+str2;
    }
    public static void main(String[] args)
    {
        MathClass me = new MathClass();
        int res = me.add(10, 30);
        System.out.println("Addition of integers is "+res);
        me.add(10,30,40,20);
        me.add(30.0f, 50.0f);
        String str_concat = me.add("Hello,", " World!");
        System.out.println("String: "+str_concat);

    }


}