/* Define an interface with three methods – earnings(), deductions() 
and  bonus()  and  define  a  Java  class  “Manager”  which  uses  this 
interface  without  implementing  bonus()  method.  Also  define 
another  Java  class  “SubStaff”  which  extends  from  “Manager” 
class and implements bonus() method. Write the complete 
program to find out earnings, deduction and bonus of a sub-staff 
with basic salary amount entered by the user as per the following 
guidelines – 
 
earnings → basic + DA (80% of basic) + HRA (15% of basic) 
deduction PF → 12% of basic 
bonus → 50% basic */

interface salary{
    double basic=50000;
    double earnings();
    double deductions();
    double bonus();
    }
class Manager implements salary{  
    public double earnings(){
        double ear=0;
        ear=basic+(0.8*basic)+(0.15*basic);
        return ear;
    } 
    public double deductions(){
        double pf=0.0;
        pf=0.12*basic;
        return pf;
    }
    public double bonus(){
        return 0;
    }
}
class SubStaff extends Manager {
    public double bonus() {
        double b = basic * 0.5;
        return b;
    }
}

public class lab7q3{
    public static void main(String[] args) {
        SubStaff staff = new SubStaff(); 
        double e = staff.earnings();
        double d = staff.deductions();
        double b = staff.bonus();
        System.out.println("Earnings: " + e);
        System.out.println("Deductions: " + d);
        System.out.println("Bonus: " + b);
    }
}
