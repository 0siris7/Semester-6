import java.io.*;
import java.net.*;
class tcpclient1
{  public static void main(String args[])throws Exception
      {
	String msgr,msgs;
	Socket s=new Socket("Localhost",6789);
	BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw1=new PrintWriter(s.getOutputStream());
	while(true)
	 {
		msgs=br2.readLine();
		if(!msgs.equals("bye"))
			{	pw1.println(msgs);
				pw1.flush();
				msgr=br1.readLine();
				System.out.println(msgr);
				
				
				
			}
		else
		  {
			System.exit(0);
		   }
	  }
	
	}

}
