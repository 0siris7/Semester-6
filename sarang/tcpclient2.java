import java.io.*;
import java.net.*;
class tcpclient2
{  public static void main(String args[])throws Exception
      {
	String msgr,msgs;
	Socket s=new Socket("Localhost",6789);
	BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw2=new PrintWriter(s.getOutputStream());
	while(true)
	 {
		msgr=br1.readLine();
		if(!msgr.equals("bye"))
			{	System.out.println(msgr);
				msgs=br2.readLine();
				pw2.println(msgs);
				pw2.flush();
				
				
				
				
			}
		else
		  {
			System.exit(0);
		   }
	  }
	
	}

}
