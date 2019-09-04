import java.io.*;
import java.net.*;
class filere
{
	public static void main(String args[]) throws Exception
		{
			try
			 {
				Process p;
				ServerSocket ss=new ServerSocket(4000);
				Socket s=ss.accept();
				BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String c=br1.readLine();
				System.out.println(c);
				p = Runtime.getRuntime().exec("cmd /c");
				p.waitFor();
				BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
				String line="";
				String filelist="";
				PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
				while((line = reader.readLine())!=null)
					{
					  filelist=filelist+line;
					}
				pw.println(filelist+"null");
				System.out.println("Command executed and send!");
				String filename=br1.readLine();
				File f=new File(filename);
				BufferedReader br2=new BufferedReader(new FileReader(f));
				if(f.exists())
				 {
					String str=new String("");
					String st="";
					while((st=br2.readLine())!=null)
					 {
						str=str+st;
					 }
					pw.println(str);
					pw.flush();
					System.out.print("File"+filename+" sent successfully!");
				  }
				else
				 {
					System.out.println("File doesn't exist!");
				 }
			 }
			catch(Exception e)
			 {
				System.out.println(e);
			}
		}
}