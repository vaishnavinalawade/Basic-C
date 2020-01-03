package org.eclipse.che.examples;

public class Array
{
    int num[] = {10,20,30,40,50,60,70};
    int mat[][] = {{90,100},{110,120}};
    public void sum()
    {
        int i;
        int sum = 0;
        for(i=0; i<num.length; i++)
        {
            sum = sum+num[i];
        }
        System.out.println("The addition of Array's is "+sum);
    }
    public void reverse()
    {
        System.out.print("The reverse of array list is ");

        for(int j=num.length-1; j>=0; j--)
        {
                System.out.print(" "+num[j]);
        }
    }
    public void print_mat()
    {
        System.out.println("\nMatrix:");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat.length; j++)
            {
                System.out.print(" "+mat[i][j]);
            }
        }
    }
    public static void main(String[] args)
    {
        Array d = new Array();
        d.sum();
        d.reverse();
        d.print_mat();

    }

}