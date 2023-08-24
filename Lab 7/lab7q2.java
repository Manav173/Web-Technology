/* Define an interface Motor with a data member –capacity and 
two methods such as run() and consume(). Define a Java class 
“Washing machine” which implements this interface and write 
the code to check the value of the interface data member thru an 
object of the class.  */

interface Motor
{ 
    int capacity=100; 
    void run();
    void consume();  
}  
class WashingMachine implements Motor
{  
    public void run(){
        System.out.println("Machine running and capacity is = " +capacity);
    } 
    public void consume(){
        System.out.println("Machine consumed and capacity is = " +capacity);
    } 
}
public class lab7q2
{
    public static void main(String args[])
    {  
        Motor obj = new WashingMachine();  
        obj.run();
        obj.consume();  
    }  
}
