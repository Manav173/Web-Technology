/* Create an user defined exception named Check Argument 
to check the number of arguments passed through 
command  line.  If  the  number  of  arguments  is  less  than 
four, throw the Check Argument exception, else print the 
addition of squares of all the four elements. */

public class lab8q4{
    public static void main(String[] args){
        int sum=0;
        int square=0;
        try
        {
            if(args.length<4)
            {
                throw new CheckArgumentException("Less than four numbers are not allowed."); 
            }
            for(int i=0; i<args.length; i++)
            {
                square = Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
                sum = sum + square;
            }
            System.out.println("The sum of squares of all the elements is " + sum);
        }
        catch(CheckArgumentException e)
        {
            System.out.println("Number less than 4 exception ");
        }
    }
}

class CheckArgumentException extends Exception {
    public CheckArgumentException(String args) {
        super();
    }
}
