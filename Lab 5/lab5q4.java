/* Write a program in java to define a class Shape which has data 
member “area” and a member function showArea(). Derive two 
classes Circle and Rectangle from Shape class. Add appropriate data 
members and member functions to calculate and display the area of 
Circle and Rectangle. */

import java.util.Scanner;

class labShape {
    protected double area;

    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class labCircle extends labShape {
    protected double radius;

    public labCircle(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
    }

    public void showArea() {
        System.out.println("Circle Area: " + area);
    }
}

class labRectangle extends labShape {
    protected double length;
    protected double breadth;

    public labRectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }

    public void showArea() {
        System.out.println("Rectangle Area: " + area);
    }
}

public class lab5q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        labCircle c = new labCircle(radius);
        labRectangle r = new labRectangle(length, breadth);

        c.showArea();
        r.showArea();
        sc.close();
    }
}
