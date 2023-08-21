/* WAP to sort the user entered list of numbers of any size using bubble sort. */

import java.util.Scanner;

public class lab3q4
{
    public static void main(String[] args)
    {  
        System.out.println("Enter the size of the array ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {  
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Before Bubble Sort");  
        for(int i=0;i<n;i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        int temp = 0;  
        for(int i=0;i<n;i++)
        {  
            for(int j=1;j<(n-i);j++)
            {  
                if(arr[j-1]>arr[j])
                {   
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }
        System.out.println("Array After Bubble Sort");  
        for(int i=0;i<n;i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
        sc.close();
    }
}  
