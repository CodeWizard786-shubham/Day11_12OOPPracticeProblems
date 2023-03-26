import java.util.Scanner;

class Account{
    private double balance;
    private double debit_Amount;
    Account(double balance,double debit_Amount){
        this.balance=balance;
        this.debit_Amount=debit_Amount;
    }
    public double getBalance(){
        return balance;
    }
    public double getDebit_Amount(){
        return debit_Amount;
    }

    public double debit() {
        if (getDebit_Amount() > getBalance()) {
            System.out.println("Debit amount exceeds Balance");
        } else {
            balance = getBalance() - getDebit_Amount();
        }
        return balance;
    }
        public void printBalance(){
        System.out.println("Account details");
        System.out.println("Your Account Balance:$"+balance);
        System.out.println("Your Debit amount:$"+debit_Amount);
        System.out.println("Your remaining balance is:$"+debit());
        }


}
public class AccountTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Balance: ");
        double balance=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter debit Amount: ");
        double debitAmount=sc.nextDouble();
        Account ac=new Account(balance,debitAmount);
        ac.printBalance();

    }
}
