import java.io.*;
import java.net.*;

class server
{	public static void main(String args[]) throws Exception
		{
			String msg = "";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			DatagramSocket s=new DatagramSocket(4000);
			while(true)
				{
					byte[] sm= new byte[100];
					byte[] rm= new byte[100];
					DatagramPacket rp=new DatagramPacket(rm,rm.length);
					s.receive(rp);
					int pt=rp.getPort();
					InetAddress ip=rp.getAddress();
					msg=new String(rp.getData());
					System.out.println(msg);
					msg=br.readLine();
					sm=msg.getBytes();
					DatagramPacket sp=new DatagramPacket(sm,sm.length,ip,pt);
					s.send(sp);
				}
			
		}
}
