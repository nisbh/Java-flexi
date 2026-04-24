import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class ModServer{
    public static void main(String[] args)throws IOException{
        System.out.println("Waiting for client...");
        try(ServerSocket server=new ServerSocket(5000);
             Socket socket=server.accept();
             Scanner in=new Scanner(socket.getInputStream());
             PrintWriter out=new PrintWriter(socket.getOutputStream(),true)){
            int a = in.nextInt();
            int b = in.nextInt();
            out.println(a % b);
            System.out.println("Calculated and sent result.");
        }
    }
}