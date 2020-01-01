package org.eclipse.che.examples;

public class Reverse
{

    public static void main(String[] args)
    {
        int n = 451;
        int temp=0;;
        while(n!=0)
        {
            temp = temp*10;
            temp = temp + n%10;
            n = n/10;
        }
        System.out.print("The reverse is "+temp);
    }
}