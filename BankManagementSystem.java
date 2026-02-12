import java.util.ArrayList;
import java.util.List;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class Account{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(String num,String name,double initialBalance) {
        this.accountNumber=num;
        this.accountHolderName=name;
        this.balance=initialBalance;
    }
    public String getAccountNumber(){return accountNumber;}
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount)throws InsufficientFundsException{
        if (amount>balance)throw new InsufficientFundsException("Insufficient funds!");
        balance-=amount;
    }
    public void transfer(Account target,double amount)throws InsufficientFundsException {
        this.withdraw(amount);
        target.deposit(amount);
    }
    public void displayAccountDetails(){
        System.out.println("Acc:"+accountNumber+"Holder:"+accountHolderName+"Balance:$"+balance);
    }
}
class Bank{
    private List<Account> accounts=new ArrayList<>();
    public void createAccount(String num,String name,double balance){
        accounts.add(new Account(num,name,balance));
    }
    public Account getAccount(String num){
        for(Account a:accounts){
            if(a.getAccountNumber().equals(num))return a;
        }
        return null;
    }
    public void displayAllAccounts(){
        for(Account a:accounts)a.displayAccountDetails();
    }
}
public class BankManagementSystem{
    public static void main(String[] args){
        Bank myBank=new Bank();
        myBank.createAccount("101","John Doe",500.0);
        myBank.createAccount("102","Jane Smith",1000.0);
        try{
            Account john=myBank.getAccount("101");
            Account jane=myBank.getAccount("102");
            System.out.println("Before Transfer:");
            myBank.displayAllAccounts();
            john.transfer(jane,200.0);
            System.out.println("\nAfter Transfer(200 from John to Jane)");
            myBank.displayAllAccounts();
            System.out.println("\nAttempting Overwithdrawal");
            john.withdraw(1000.0);
        } catch (InsufficientFundsException e){
            System.err.println("Error:"+e.getMessage());
        }
    }
}