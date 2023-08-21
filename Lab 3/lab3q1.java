/* WAP to find the largest among 3 numbers user entered nos. at the command prompt using Java. */

import java.util.Scanner;

public class lab3q1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
            System.out.println("The largest number is = "+a);
        else if(b>a && b>c)
            System.out.println("The largest number is = "+b);
        else if(c>a && c>b)
            System.out.println("The largest number is = "+c);
        else
            System.out.println("All three numbers are equal");
        sc.close();
    }
}
