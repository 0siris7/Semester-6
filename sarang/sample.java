import java.io.*;
class nwthread implements Runnable
{
 Thread t;
 String name;
 nwthread(String n)
  { name=n;
   t=new Thread(this,name);
   System.out.println("Thread created:"+name);
   t.start();
  }

 public void run()
  { int i;
try
   {
     
     for (i=5;i>0;i--)
      {  
         System.out.println(i);
         t.sleep(1000);

       }
     
   }
   
   catch(InterruptedException e)
    {
      System.out.println("error occured");
    }
  
  }
}

class sample
{
 public static void main(String args[])
 {
   nwthread ob1=new nwthread("ONE");
   nwthread ob2=new nwthread("TWO");
   nwthread ob3=new nwthread("THREE");
   try
    {
    System.out.println("Thread one alive:"+ob1.t.isAlive());
    System.out.println("Thread two alive:"+ob2.t.isAlive());
    System.out.println("Thread three alive:"+ob3.t.isAlive());
    ob1.t.join();
    System.out.println("Thread1 joined");
    ob2.t.join();
    System.out.println("Thread2 joined");
    ob3.t.join();
    System.out.println("Thread3 joined");
    System.out.println("Thread one alive:"+ob1.t.isAlive());
    System.out.println("Thread two alive:"+ob2.t.isAlive());
    System.out.println("Thread three alive:"+ob3.t.isAlive());
    }
   catch(InterruptedException e)
    {
      System.out.println("error occured");
    }
   
 }
}


