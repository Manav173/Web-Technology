/*  Write a program in java using inheritance to show how to call the 
base  class  parameterized  constructors  from  the  derived  class 
using super.  */

class plate
{
	public plate(int i, int j)
	{
		System.out.println("Parameterized constructor of class plate");
	}
}

class box extends plate
{
	public box()
	{
		super(10, 20);
		System.out.println("Constructor of class box");
	}
}

public class lab6q5
{
	public static void main(String[] args)
	{

		box b = new box();
	}
}
