/* Illustrate the usage of abstract class with following Java classes  
i) An abstract class “student” with data member roll no, reg no 
and an abstract method course() 
ii) A subclass “kiitian” with course() method implementation */

abstract class Student {
    int rollNo;
    int regNo;
    public abstract void course();
}
class Kiitian extends Student {
    public void course() {
        System.out.println("Studying computer science");
    }
}
public class lab7q1{
    public static void main(String[] args){
        Kiitian s=new Kiitian();
        s.course();
    }
}
