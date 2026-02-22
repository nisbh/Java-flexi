class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
class InvalidAmountException extends Exception{
    InvalidAmountException(String message){
        super(message);
    }
}
class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void withdraw(double amount)
            throws InsufficientFundsException,InvalidAmountException{
        if (amount%100!=0){
            throw new InvalidAmountException(
                "Withdrawal amount must be in multiples of 100"
            );
        }
        if (amount>balance) {
            throw new InsufficientFundsException(
                "Insufficient balance in account"
            );
        }
        balance=balance-amount;
        System.out.println("Withdrawal successful: "+amount);
        System.out.println("Remaining balance: "+balance);
    }
}
public class ATMWithdrawalDemo{
    public static void main(String[] args){
        BankAccount account=new BankAccount(10101,5000);
        try{
            account.withdraw(1200);
            account.withdraw(250); 
        }
        catch(InvalidAmountException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(InsufficientFundsException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}