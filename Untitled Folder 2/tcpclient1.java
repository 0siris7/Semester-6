import java.io.*;
import java.net.*;
class tcpclient1
{
public static void main(String argv[]) throws Exception
	{
	String msgs,msgr;
	Socket s=new Socket("localhost",4000);
	BufferedReader br1=new BufferedReader(new InputStreamReader (s.getInputStream()));
	while(true)
	{
		msgr=br1.readLine();
		System.out.println(msgr);
			}
	}
}
