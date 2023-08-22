/* Write a program in Java to define a class Rectangle having data 
member: length and breadth; to calculate the area and perimeter of the 
rectangle. Use constructors and member functions to read, calculate 
and display. */

import java.util.Scanner;

public class lab5q1
{
    private double length;
    private double breadth;
    
    public lab5q1(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() 
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getBreadth() 
    {
        return breadth;
    }

    public void setBreadth(double breadth) 
    {
        this.breadth = breadth;
    }

    public double area() 
    {
        return length * breadth;
    }

    public double perimeter() 
    {
        return 2 * (length + breadth);
    }

    public void display() 
    {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        lab5q1 rect = new lab5q1 (length, breadth);
        rect.display();
        sc.close();
    }
}
