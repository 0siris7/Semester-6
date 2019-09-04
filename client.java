import java.io.*;
import java.net.*;

class client
{	public static void main(String args[]) throws Exception
		{
			String msg = "";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			DatagramSocket s=new DatagramSocket();
			InetAddress ip=InetAddress.getByName("127.0.0.1");
			while(true)
				{
					byte[] sm= new byte[100];
					byte[] rm= new byte[100];
					msg=br.readLine();
					sm=msg.getBytes();
					DatagramPacket sp=new DatagramPacket(sm,sm.length,ip,4000);
					s.send(sp);
					DatagramPacket rp=new DatagramPacket(rm,rm.length);
					s.receive(rp);
					msg=new String(rp.getData());
					System.out.println(msg);
					
				}
			
		}
}
