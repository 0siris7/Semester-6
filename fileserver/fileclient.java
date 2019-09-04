import java.io.*;
import java.net.*;
class fileclient
{	
	public static void main(String args[])throws Exception
		{
			try{
				Socket s=new Socket("localhost",4000);
				System.out.println("CONNECTED");
				BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("ENTER A FILENAME:");
				String filename=br1.readLine();
				PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
				pw.println(filename);
				pw.flush();
				BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String str="";
				String st="";
				PrintStream out = new PrintStream(new FileOutputStream("copy.txt"));
				while((str=br2.readLine())!=null)
				 {
					//str=str;
					out.println(str);
				  }
				//str=br2.readLine();
				//out.print(str);
				System.out.println("FILE WRITTEN");
			    }
			catch(Exception e)
			 {
				System.out.println("Exception Occured:"+e);
			 }
		}
}