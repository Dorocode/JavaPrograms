import java.io.*;
class Swapd{
	public static void main(String args []){
		DataInputStream din= new DataInputStream(System.in);
		int a, b, temp;
		try{
			System.out.println("Enter the first Number:");
			a=Integer.parseInt(din.readLine());
			System.out.println("Ente the second Number:");
			b=Integer.parseInt(din.readLine());
			/*a=a+b;
			b=a-b;
			a=a-b;*/
			

			System.out.println("After Swapping:");
			System.out.println("===============");
			System.out.println("First number:"+a);
			System.out.println("Second number:"+b);

		}catch(Exception e){
			System.out.println("Error:"+e);
		}
	}
}
