/* Write a program in java using inheritance to show how to call 
the base class parameterized constructors from the derived class using 
super. Consider the base class is “Shape2D” for rectangle and define 
subclass “Shape3D” for cube. */

class Shape2D {
    protected double length;
    protected double breadth;

    public Shape2D(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Shape3D extends Shape2D {
    protected double height;

    public Shape3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }
}

public class lab5q5 {
    public static void main(String[] args) {
        Shape3D cube = new Shape3D(5, 5, 5);
        double volume = cube.getVolume();
        System.out.println("Cube volume: " + volume);
    }
}
