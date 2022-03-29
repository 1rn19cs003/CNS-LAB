import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Server ready for communication");
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket socket = serverSocket.accept();

            InputStream iStream = socket.getInputStream();
            Scanner sin = new Scanner(iStream);
            String fname = sin.next();

            OutputStream oStream = socket.getOutputStream();
            PrintWriter pWriter = new PrintWriter(oStream, true);
            File file = new File(fname);
            Scanner fin = new Scanner(file);
            while (fin.hasNext())
                pWriter.println(fin.next());
            System.out.println("Connection is successful and file contents are displayed in the client window");
            sin.close();
            fin.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("error is " + e);
        }
    }
}