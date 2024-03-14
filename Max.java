import java.io.*;
class CMax
{
  public static void main(String args[])
  {
	DataInputStream din;
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
	 if(a > b && a>c)
	  System.out.println("Maximum is " + a);
	 else if(b>a && b>c)
	  System.out.println("Maximum is " + b);
     else{
        System.out.println("Maximum is "+ c);
     }
        
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}