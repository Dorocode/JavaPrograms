import java.io.*;
class Product
{
  public static void main(String args[])
  {
	DataInputStream din;
	int a,b;
	din = new DataInputStream(System.in);
	try
	{
	 System.out.println("Enter the first Number:");
	 a = Integer.parseInt(din.readLine());
	 System.out.println("Enter the second Number:");
	 b = Integer.parseInt(din.readLine());
	 System.out.println("the Product of " + a + " and " + b  +" is " + (a*b));
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}
