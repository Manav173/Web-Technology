/* Illustrate the execution of constructors in multi-level inheritance 
with three Java classes – plate (length, width), box (length, width, 
height), wood box (length, width, height, thick)  */

class plate 
{  
    int length=2;
    int width=3;
    plate()  
    {  
        int sum=length + width;
        System.out.println("Plate constructor executed");
        System.out.println("length + width : "+sum);  
    }  
}  
  
class box extends plate  
{  
    int height=5;  
    box()  
    {  
        int sum=length + width + height;
        System.out.println("Box constructor executed"); 
        System.out.println("length + width + height : "+sum);    
    }  
}  
  
class woodbox extends box   
{  
    int thick=10; 
    woodbox()  
    {  
        int sum=length + width + height + thick;
        System.out.println("Wood Box constructor executed");  
        System.out.println("length + width + height + thick : "+sum);
    }  
}  
public class lab6q2  
{   
    public static void main(String ar[])   
    {   
        System.out.println("Order of constructor execution in Multilevel inheritance...");  
        new woodbox();    
    }  
}  
