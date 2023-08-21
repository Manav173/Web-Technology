/* WAP to design a calculator which receive <first number> <operator> <second number> from command line and display result. */

import java.util.Scanner;

public class lab3q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        char c;
       
        
        System.out.println("Enter + for addition - for subtraction * for multiplication / for division");
        char ch=sc.next().charAt(0);
        do{
            switch(ch){

                case '+':
                int sum=0;
                sum=x+y;
                System.out.println("The sum is =" +sum);
                break;
                case '-':
                int diff=0;
                diff=x-y;
                System.out.println("The difference is =" +diff);
                break;
                case '*':
                int p=1;
                p=x*y;
                System.out.println("The product is =" +p);
                break;
                case '/':
                double d=0.0;
                d=x/y;
                System.out.println("The division is =" +d);
                break;
            }
            System.out.println("Do you want to continue? y/n");
            c=sc.next().charAt(0);
        }
        while(ch=='y');
        sc.close();
    }
}
