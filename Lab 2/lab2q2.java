/* WAP to find the perimeter and area of a circle given a value of radius. */ 

import java.util.Scanner;

public class lab2q2
{
    public static void main(String args[])
    {
        System.out.println("Enter the radius of circle");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double peri=0.0;
        peri=2*3.14*r;
        double area=0.0;
        area=3.14*r*r;
        System.out.println("Perimeter of the circle is = "+ peri);
        System.out.println("Area of the circle is = "+ area);
        sc.close();
    }
}