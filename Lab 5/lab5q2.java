/* Write a program which will overload the area () method and 
display the area of a circle, triangle and square as per user choice and 
user entered dimensions. */

import java.util.Scanner;

public class lab5q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of circle: " + area(radius));
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of triangle: " + area(base, height));
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                int side = sc.nextInt();
                System.out.println("Area of square: " + area(side));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }

    public static double area(double radius) 
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double base, double height) 
    {
        return 0.5 * base * height;
    }

    public static double area(int side) 
    {
        return side * side;
    }
}
