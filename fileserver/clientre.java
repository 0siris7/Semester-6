import java.io.*;
import java.net.*;
class clientre
{	
	public static void main(String args[])throws Exception
		{
			try{
				Socket s=new Socket("localhost",4000);
				System.out.println("CONNECTED");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
				System.out.println("ENTER Command:");
				String c=br.readLine();
				pw.println(c);
				BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("1");
				String temp="";
				String list="";
				list=br1.readLine();
				System.out.println(list);
				System.out.println("2");
				System.out.println("Enter the file name:");
				String filename=br.readLine();
				pw.println(filename);
				String str="";
				PrintStream out=new PrintStream(new FileOutputStream("copy1.txt"));
				str=br1.readLine();
				out.print(str);
				System.out.println("FILE "+filename+" Downloaded successfully");
				
			    }
			catch(Exception e)
			 {
				System.out.println("Exception Occured:"+e);
			 }
		}
}