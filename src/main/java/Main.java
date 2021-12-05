import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        Person p1 = new Person();
//        Person p2 = new Person("ASDF", 30, 'M');
//        System.out.println(p2.getGender());

        BankAccount ba1 = new BankAccount("sar",101);
        Scanner bal = new Scanner(System.in);
        System.out.println("Enter current balance: ");
        double currBalace = bal.nextDouble();

        ba1.setBalance(currBalace);
        System.out.println("Your present balance is " + ba1.CheckBalance());

        Scanner dep = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        double deposit = dep.nextDouble();
        System.out.println("Your updated balance is "+ ba1.Deposit(deposit));

        Scanner wit = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        double withdraw = wit.nextDouble();
        System.out.println("Your updated balance is "+ ba1.Withdrawal(withdraw));
        }

    }

