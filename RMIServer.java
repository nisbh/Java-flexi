import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
public class RMIServer extends UnicastRemoteObject implements ModInterface{
    protected RMIServer() throws RemoteException{super();}
    public int calculateMod(int a,int b){ 
        return a%b; 
    }
    public static void main(String[] args)throws Exception{
        LocateRegistry.createRegistry(1099); 
        Naming.rebind("ModService",new RMIServer());
        System.out.println("RMI Server is ready...");
    }
}