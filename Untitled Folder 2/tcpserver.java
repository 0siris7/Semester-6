import java.io.*;
import java.net.*;
class tcpserver
{
	public static void main(String args[])throws Exception
	{
		String msgs;
		int i;
		ServerSocket ss=new ServerSocket(4000);
		Socket []s=new Socket[3];
		for(i=0;i<3;i++)
		{
			s[i]=ss.accept();
			System.out.println("connected client"+i);
			}
		
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			msgs=br2.readLine();
			for(i=0;i<3;i++)
			{
				PrintWriter pw=new PrintWriter(s[i].getOutputStream());
				pw.println(msgs);
				pw.flush();
				}	
		}
		

	}
}
