import java.util.Scanner;

public class lab2q5
{
    public static void main(String arg[])
    {
        System.out.println("Enter the number to be checked");
        Scanner Sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,a=n,sum=0;
        while(a>0)
        {
            d=a%10;
            a=a/10;
            sum=sum+d*d*d;
        }
        if(sum==n)
        {
            System.out.println("The number " + n +" is an armstrong number");
        }
        else
        {
            System.out.println("The number " + n +" is not an armstrong number");
        }
    }
}