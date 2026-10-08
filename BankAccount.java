import java.util.Scanner;
public class BankAccount{
    int accountnumber;
    String accountholdername;
    double balance;

    BankAccount(int accountnumber, String accountholdername, double balance){
        this.accountnumber=accountnumber;
        this.accountholdername=accountholdername;
        this.balance=balance;
    }

    void deposit(double amount){
        balance=balance+amount;
    }

    void withdraw(double amount){
        if (amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawal Successful");
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    double checkbalance(){
        return balance;
    }

    void displayaccount(){
        System.out.println("Account Number:"+accountnumber);
        System.out.println("Account Holder Name:"+accountholdername);
        System.out.println("Balance:"+balance);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Account Number:");
        int accountnumber=sc.nextInt();

        System.out.print("Enter Account Holder Name:");
        String accountholdername=sc.next();

        System.out.print("Enter Initial Balance:");
        double balance=sc.nextDouble();

        BankAccount account=new BankAccount(
            accountnumber,
            accountholdername,
            balance
        );

        System.out.print("Enter Deposit Amount:");
        double depositAmount=sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter Withdrawal Amount:");
        double withdrawalAmount=sc.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.println("Final Account Details:");
        account.displayaccount();

        sc.close();
    }
}