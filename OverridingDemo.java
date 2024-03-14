import java.util.Scanner;
import java.io.*;
class Person{
	String name;
	int age;
	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Age"+age);
	}
	public void readme(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter age: ");
		age=sc.nextInt();
	}
}
class Student extends Person{
	int rollNo;
	
	int level;
	public void readme(){
		super.readme();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student RollNumber: ");
		rollNo=sc.nextInt();
		System.out.println("Enter Student Level: ");
		level=sc.nextInt();
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Roll No: "+ rollNo);
		System.out.println("Level: "+ level);
	}
}
class Teacher extends Person{
	String subject;

	public void readme(){
	super.readme();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Subject: ");
	subject=sc.nextLine();
	
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Subject"+subject);
	}
}
class OverridingDemo{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int choice;
		do{
			System.out.println("  ==MENU==");
			System.out.println("1. CREATE STUDENT AND DISPLAY DETAILS");
			System.out.println("2. CREATE TEACHER AND DISPLAY DETAILS");
			System.out.println("3. EXIT");
			System.out.println(" Enter Your Choice ");
			choice = s.nextInt();
			s.nextLine();
			Teacher trs= new Teacher();
			Student stu = new Student();
			switch(choice){
				case 1:
					
					stu.readme();
					System.out.println("********************");
					stu.displayDetails();
					System.out.println("********************");
					break;
				case 2:
					
					trs.readme();
					System.out.println("********************");
					trs.displayDetails();
					System.out.println("********************");
					break;
				default:
					System.out.println("try Again");

			}
		}while(choice!=3);
	}

}