/* A plastic manufacturer sells plastic in different shapes like 2D 
sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the 
cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the 
cost of plastic as per the dimensions given by the user where 3D 
inherits from 2D. */

import java.util.Scanner;

class TwoDPlastic {
    protected double length;
    protected double breadth;

    public TwoDPlastic(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

class ThreeDPlastic extends TwoDPlastic {
    protected double height;

    public ThreeDPlastic(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }
}

public class lab5q3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a shape to calculate cost:");
        System.out.println("1. 2D sheet");
        System.out.println("2. 3D box");
        int choice = sc.nextInt();
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = sc.nextDouble();
        switch (choice) 
        {
            case 1:
                TwoDPlastic sheet = new TwoDPlastic(length, breadth);
                double sheetArea = sheet.getArea();
                double sheetCost = sheetArea * 40;
                System.out.println("Area of sheet: " + sheetArea + " sq. ft.");
                System.out.println("Cost of sheet: Rs. " + sheetCost);
                break;
            case 2:
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                ThreeDPlastic box = new ThreeDPlastic(length, breadth, height);
                double volume = box.getVolume();
                double cost = volume * 60;
                System.out.println("Volume of box: " + volume + " cu. ft.");
                System.out.println("Cost of box: Rs. " + cost);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
