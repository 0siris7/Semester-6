import java.io.*;
import java.net.*;
class tcpserver
{  public static void main(String args[])throws Exception
      {
	String msgr,msgs;
	ServerSocket ss=new ServerSocket(6789);
	Socket s1=ss.accept();
	Socket s2=ss.accept();
	BufferedReader br1=new BufferedReader(new InputStreamReader(s1.getInputStream()));
	BufferedReader br2=new BufferedReader(new InputStreamReader(s2.getInputStream()));
	PrintWriter pw1=new PrintWriter(s1.getOutputStream());
	PrintWriter pw2=new PrintWriter(s2.getOutputStream());
	while(true)
	 {
		msgr=br1.readLine();
		if(!msgr.equals("bye"))
			{
				
				pw2.println(msgr);
				pw2.flush();
				msgs=br2.readLine();
				pw1.println(msgs);
				pw1.flush();
			}
		else
		  {
			System.exit(0);
		   }
	  }
	
	}

}
