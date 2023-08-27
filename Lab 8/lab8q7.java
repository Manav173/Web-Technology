/* Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement. */

public class lab8q7 {  
    public static void main(String[] args)throws ArrayOutOfBoundException {  
    String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
        for(int i=0;i<=arr.length;i++) {       
             System.out.println(arr[i]);                
        } 
        if(arr.length>4){
            throw new ArrayOutOfBoundException("Array out of bound");
        } 
    }  
}
class ArrayOutOfBoundException extends Exception{
    public ArrayOutOfBoundException(String str){
        super(str);
    }
}
