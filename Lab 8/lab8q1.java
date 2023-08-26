/* Write a Java class which has a method called 
ProcessInput().  This  method  checks  the  number  entered 
by the user. If the entered number is negative then throw 
an user defined exception called 
NegativeNumberException, otherwise it displays the 
double value of the entered number. */

import java.util.Scanner;

public class lab8q1{

    public void ProcessInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        double n = sc.nextDouble();
        sc.close();
        try
        {
            if(n<0)
            {
                throw new NegativeNumberException("Negative numbers are not allowed."); 
            }
            n=2*n;
            System.out.println("The double of the number is " + n);
        }
        catch (NegativeNumberException e) 
        {
            System.out.println("Negative number exception ");
        }
    }
    public static void main(String[] args){
        lab8q1 l=new lab8q1();
        l.ProcessInput();
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String args) {
        super();
    }
}
