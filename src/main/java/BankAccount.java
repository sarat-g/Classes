import java.util.Scanner;

public class BankAccount {
    private String accName;
    private int accNum;
    private double balance = 0;

    public BankAccount(String accName, int accNum){
        this.accName = accName;
        this.accNum = accNum;
        this.balance = 0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double CheckBalance(){
        return balance;
    }

    public double Deposit(double depAmount){
        balance = balance+depAmount;
        return balance;
    }

    public double Withdrawal(double withdrawAmount){
        if(withdrawAmount<balance){
            balance = balance - withdrawAmount;
            return balance;
            }
        else {
            System.out.println("Insufficient Balance, your current balance is " + CheckBalance() + "Please enter a lower amount");
            Scanner with = new Scanner(System.in);
            double withdrawAmount1 = with.nextDouble();
            return(Withdrawal(withdrawAmount1));
        }
    }
}
