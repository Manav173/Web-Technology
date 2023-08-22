/* Write a class file – box with three data members(length, width, height) and a 
method volume() . Also implement the application class Demo where an object of 
the box class is created with user entered dimensions and volume is printed.  */

import java.util.Scanner; 

class box
{  
    int length;  
    int width; 
    int height;  
    void insertRecord(int l,int w,int h)
    {  
        length=l;
        width=w;
        height=h;
    } 
    void volume()
    {  
        int volume = length*width*height;
        System.out.println("Volume of the box is "+volume);
    }  
}  
class lab4q1
{  
    public static void main(String args[])
    {  
        box b=new box();
        Scanner ob = new Scanner(System.in);   
        System.out.print("Enter the length of the box :- "); 
        int l = ob.nextInt();
        System.out.print("Enter the width of the box :- ");
        int w = ob.nextInt(); 
        System.out.print("Enter the height of the box :- "); 
        int h = ob.nextInt(); 
        b.insertRecord(l,w,h);   
        b.volume();   
        ob.close();
    }  
}
