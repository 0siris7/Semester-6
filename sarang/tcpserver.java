import java.io.*;
import java.net.*;
class tcpserver
{ public static void main(String args[]) throws Exception
    {
      String msgs,msgr;
      ServerSocket ss=new ServerSocket(6789);
      Socket s=ss.accept();
      BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
      BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(s.getOutputStream());
      
      while(true)
       {
         msgr=br1.readLine();
         System.out.println(msgr);
         msgs=br2.readLine();
         pw.println("Server:"+msgs);
         pw.flush();
       }
      
      
    }
}
