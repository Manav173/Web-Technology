/* WAP to find out square root of a number without using library function*/

import java.util.Scanner; 

public class lab2q1
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");  
        Scanner ob = new Scanner(System.in);   
        int n = ob.nextInt();  
        double t;  
        double root=n/2;  
        do   
        {  
            t=root;  
            root=(t+(n/t))/2;  
        }   
        while((t-root)!= 0);  
        System.out.println("The square root of "+ n +" is: "+ root); 
        ob.close();
    }
}