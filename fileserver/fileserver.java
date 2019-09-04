import java.io.*;
import java.net.*;
class fileserver
{	
	public static void main(String args[])throws Exception
		{
			try{
				ServerSocket ss= new ServerSocket(4000);
				Socket s=ss.accept();
				BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String filename=br1.readLine();
				File f=new File(filename);
				BufferedReader br2=new BufferedReader(new FileReader(f));
				PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
				if(f.exists())
				 {
					
					String st="";
					while((st=br2.readLine())!=null)
					  {
						//str+=st;
						//System.out.print(st+"\n");
						pw.println(st);
						pw.flush();
					   }
					
					System.out.println("FILE:"+filename+" sent");
					
				  }
				else
				 {
					System.out.println("FILE DOESNT EXIST");
				 }
			    }
			catch(Exception e)
			 {
				System.out.println("Exception Occured");
			 }
		}
}