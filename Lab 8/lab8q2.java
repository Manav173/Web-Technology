/* Write  a  java  program  to  create  Account  with  500  rupee 
minimum balance, deposit amount, withdraw amount and 
also throws LessBalanceException which returns the 
statement that says withdraw amount is not valid. */

public class lab8q2 {
    private int balance;
    private final int MIN_BALANCE = 500;

    public lab8q2() {
        balance = MIN_BALANCE;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " rupees deposited. Current balance: " + balance);
    }

    public void withdraw(int amount) throws LessBalanceException {
        if (balance - amount < MIN_BALANCE) {
            throw new LessBalanceException("Withdrawal amount is not valid. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println(amount + " rupees withdrawn. Current balance: " + balance);
    }

    public static void main(String[] args) {
        lab8q2 account = new lab8q2();
        account.deposit(1000);
        try {
            account.withdraw(800);
            account.withdraw(800);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}
