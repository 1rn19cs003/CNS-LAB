import java.io.Console;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.*;
import java.util.Scanner;
public class UDPS {
    public static void main(String[] args) {
        DatagramSocket skt = null;
        try {
		    Scanner in = new Scanner(System.in);
		    DatagramSocket socket=new DatagramSocket();
		    String msg=in.nextLine();
            
		    byte code[]=msg.getBytes();
		    InetAddress iAddress=InetAddress.getByName("127.0.0.1");
		    DatagramPacket request=new DatagramPacket(code,code.length,iAddress,8000);
		    socket.send(request);
            socket.close();
            in.close();
		}
        catch (Exception ex)
        {
            System.out.println("error is "+ ex);
        }
    }
}