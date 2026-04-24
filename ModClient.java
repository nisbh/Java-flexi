import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class ModClient{
    public static void main(String[] args)throws IOException{
        try (Socket socket=new Socket("localhost",5000);
             PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
             Scanner in=new Scanner(socket.getInputStream())){
            out.println("17 5");          
            System.out.println("Server calculated Modulus: " + in.nextLine());
        }
    }
}