/* Write a program in java to input and display the details of n number of students 
having  roll,  name  and  cgpa  as  data  members.  Also  display  the  name  of  the 
student having lowest cgpa. */

import java.util.Scanner; 

class Student
{  
    int roll;  
    String name; 
    int cgpa;
    void read()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the roll number of student :- "); 
        int r = ob.nextInt();
        System.out.print("Enter the name of student :- "); 
        String n = ob.next();
        System.out.print("Enter the cgpa of student :- "); 
        int c = ob.nextInt();
        roll = r;
        name = n;
        cgpa = c;
        ob.close();
    } 
    void display()
    {
        System.out.println("Roll No. :- "+roll);
        System.out.println("Name :- "+name);
        System.out.println("CGPA :- "+cgpa);
    }
    void lowestCGPA(int n,Student s[])
    {
        int l=s[0].cgpa;
        String lname=s[0].name;
        for(int i=1; i<n; i++)
        {
            if(s[i].cgpa<l)
            {
                l=s[i].cgpa;
                lname=s[i].name;
            }
        }
        System.out.println("The person with lowest CGPA of "+l+" is "+lname);
    }
}  
class lab4q3
{  
    public static void main(String args[])
    {  
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the no. of students :- ");
        int n=ob.nextInt();
        Student r[];
        r=new Student[n];
        for(int i=0; i<n; i++)
        {
            r[i]=new Student();
            r[i].read();
        } 
        for(int i=0; i<n; i++)
        {
            r[i].display();
        } 
        r[0].lowestCGPA(n,r);
        ob.close();
    }  
}
