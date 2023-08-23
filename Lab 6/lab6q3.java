/* Program creates a superclass called Shape that stores the 
dimensions  of  a  two-dimensional  object.  It  defines  a  method 
called  area () that  computes the  area of an object. The  program 
derives two subclasses from Shape. The first is Rectangle and the 
second is Triangle. Each of these subclasses overrides area () so 
that it returns the area of a rectangle and a triangle, respectively.  */

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
        super.area();
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
        super.area();
        double a=0.0;
        a=.5*base*height;
        System.out.println(a);
    }
}
public class lab6q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length , breadth , base , height respectively");
        int l,b,ba,h;
        l=sc.nextInt();
        b=sc.nextInt();
        ba=sc.nextInt();
        h=sc.nextInt();
        Rectangle r=new Rectangle(l,b);
        r.area();
        Triangle t =new Triangle(ba,h);
        t.area();
        sc.close();
    }
}
