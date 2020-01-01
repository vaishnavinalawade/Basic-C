package org.eclipse.che.examples;

public class Krishnamurthy
{
    public static void main(String[] args)
    {
        int n = 40585;
        int k = 0;
        int s = n;
        while(n!=0)
        {
            int m = n%10;
            int fact = 1;
            while(m!=0)
            {
                fact = fact *m;
                m--;

            }
            k = k+fact;
            n=n/10;
        }
        if(k==s)
        {
            System.out.print("The number is a Krishnamurthy number");
        }
        else{
            System.out.print("The number is not a Krishnamurthy number");
        }

    }


}