abstract class Plan{
    private String patientName;
    private double  baseFee;
    abstract double calculateBill();
    Plan(String patientName, double baseFee){
        this.patientName = patientName;
        this.baseFee = baseFee;
    }
    String getPatientName(){
        return patientName;
    }
    double getBaseFee(){
        return baseFee;
    }
}

class SilverPlan extends Plan{
    SilverPlan(String patientName, double baseFee){
        super(patientName, baseFee);
    }
    @Override
    double calculateBill(){
        return getBaseFee() + 15;
    }


}
class GoldPlan extends Plan{
    GoldPlan(String patientName, double baseFee){
        super(patientName, baseFee);
    }
    @Override
    double calculateBill(){
        return getBaseFee()-20+(getBaseFee()*0.1);
    }
}
public class MedBilling{
    public static void printInvoice(Plan p){
        System.out.println("Patient name:"+p.getPatientName());
        System.out.println("Total bill:"+p.calculateBill());
    }
    public static void main(String[] args){
        Plan silver=new SilverPlan("John", 100);
        Plan gold=new GoldPlan("Sophia",200);
        Plan gold2=new GoldPlan("Max",50);
        printInvoice(silver);
        printInvoice(gold);
        printInvoice(gold2);
    }
    
}