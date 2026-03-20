abstract class Payment{
    public abstract double processPayment();

    private int transactionId;
    private double amount;
    public Payment(int transactionId,double amount){
        this.transactionId=transactionId;
        this.amount=amount;
    }
    public int getTransactionId() {
        return transactionId;
    }
    public double getAmount() {
        return amount;
    }

}
class CreditCardPayment extends Payment{
    public CreditCardPayment(int transactionId,double amount){
        super(transactionId,amount);
    }
    @Override
    public double processPayment(){
        return getAmount()+(0.02*getAmount());
        
    }
}
class UPIPayment extends Payment{
    private String upiId;

    public UPIPayment(int transactionId,double amount,String upiId){
        super(transactionId,amount);
        if(upiId==null || upiId.isEmpty()){
            throw new IllegalArgumentException("Invalid UPI ID");
        }
        this.upiId=upiId;
    }
    @Override 
    public double processPayment() {
        return getAmount();        
    }

}
class PaymentProcessor{
    public double process(Payment p){
        return p.processPayment();
    } 
}
public class SmartGateway{
    public static void main(String[] args){
        Payment tc1=new CreditCardPayment(1,1000);
        Payment tc2=new UPIPayment(2,1000,"n@okhdfc");
        PaymentProcessor p=new PaymentProcessor();
        System.out.println("Credit Card:"+p.process(tc1));
        System.out.println("UPI:"+p.process(tc2));
        Payment[] pay={tc1,tc2};
        double total=0;
        for(Payment p1:pay){
            total=total+p1.processPayment();
        }
        System.out.println("Total Amount:"+total);
    }
}