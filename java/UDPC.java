import java.net.*;

public class UDPC{

	public static void main(String[] args) throws Exception{
        try{
		DatagramSocket socket=new DatagramSocket(8000);
		byte data[]=new byte[1000];
		while(true) 
        {
			DatagramPacket request=new DatagramPacket(data, data.length);
			socket.receive(request);
			String str=new String(request.getData());
			System.out.println(str);		
            
		}
        socket.close();
    } catch (Exception e) {
        System.out.println("Error is "+e);
    }
	}
}