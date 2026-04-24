import java.rmi.Naming;
public class RMIClient{
    public static void main(String[] args)throws Exception{
        ModInterface service=(ModInterface)Naming.lookup("rmi://localhost/ModService");
        int result=service.calculateMod(25,7);
        System.out.println("The modulus of 25 and 7 from RMI is: "+result);
    }
}