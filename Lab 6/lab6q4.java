/* Implement Program 3 using Dynamic Method Dispatch. */

import java.util.Scanner;

class Shape{
    public void area(){
        System.out.println("The area of the two dimensional object is :");
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(int l, int b){
        this.length=l;
        this.breadth=b;
    }
    public void area(){
        double ar=0.0;
        ar=length*breadth;
        System.out.println(ar);
    }
}
class Triangle extends Shape{
    int base;
    int height;
    public Triangle(int ba,int h){
        this.base=ba;
        this.height=h;
    }
    public void area(){
        double a=0.0;
        a=.5*base*height;
        System.out.println(a);
    }
}
public class lab6q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length , breadth , base , height respectively");
        int l,b,ba,h;
        System.out.println("Length :");
        l=sc.nextInt();
        System.out.println("Breadth :");
        b=sc.nextInt();
        System.out.println("Base :");
        ba=sc.nextInt();
        System.out.println("Height :");
        h=sc.nextInt();
        Shape s=new Shape();
        Shape ref;
        ref=s;
        ref.area();
        Rectangle r=new Rectangle(l,b);
        ref=r;
        System.out.println("Area of rectangle: ");
        ref.area();
        Triangle t =new Triangle(ba,h);
        ref=t;
        System.out.println("Area of the triangle: ");
        ref.area();
        sc.close();
    }
}
