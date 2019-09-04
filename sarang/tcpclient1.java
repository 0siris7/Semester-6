import java.io.*;
import java.net.*;
class tcpclient1
{ public static void main(String args[]) throws Exception
    {
      String msgs,msgr;
      Socket s=new Socket("Localhost",6789) ;
      BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
      BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(s.getOutputStream());
      
      do
       {
         msgs=br2.readLine();
         pw.println("Client:"+msgs);
         pw.flush();
         msgr=br1.readLine();
         System.out.println(msgr);
         
       }while(!(msgr.equals("bye")));
      
      
    }
}
