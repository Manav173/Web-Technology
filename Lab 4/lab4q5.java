/* Write a program in Java to define a class Number with appropriate data 
members and member functions to input n number of integers and swap the 
biggest and smallest elements. Use member functions read(), swap() and 
display(). */

import java.util.Scanner;

class Number
{
    int size;
    int n[];
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        size=sc.nextInt();
        n=new int[size];
        System.out.println("Enter the numbers :-");
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        sc.close();
    }
    void swap()
    {
        int s=n[0],l=n[0];
        int temp,sp=0,lp=0;
        for(int i=0;i<size;i++)
        {
            if(n[i]<s)
            {
                s=n[i];
                sp=i;
            }
            else if(n[i]>l)
            {
                l=n[i];
                lp=i;
            }
        }
        temp=n[sp];
        n[sp]=n[lp];
        n[lp]=temp;
    }
    void display()
    {
        System.out.println("The array after swapping values is :-");
        for(int i=0;i<size;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}
class lab4q5{
    public static void main(String args[])
    {
        Number n=new Number();
        n.read();
        n.swap();
        n.display();
    }
}
