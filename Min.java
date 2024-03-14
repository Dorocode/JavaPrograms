import java.io.*;
class Min
{
  public static void main(String args[])
  {
	DataInputStream din;
    int minm;
	String s;
	int a,b,c;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter the first Number:");
	 s = din.readLine();
	 a = Integer.parseInt(s);
	 System.out.println("Enter the second Number:");
	 s = din.readLine();
	 b = Integer.parseInt(s);
     System.out.println("Enter the thrid Number:");
     s=din.readLine();
     c=Integer.parseInt(s);
	 
     minm=Math.min(Math.min(a, b), c);

     System.out.println("The Minimum Number is:"+ minm);
        
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}