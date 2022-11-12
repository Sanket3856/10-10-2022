package oopsconcept;

import java.util.Scanner;

class Student
{
int id; //instance variable
String name,address,course;  //instance variable
float fees;  //instance variable

void setData(int id,String name,String address,String course,float fees)
{
	this.id=id;
	this.name=name;
	this.address=address;
	this.course=course; 
	this.fees=fees;
}

   void displayData()
   {
   System.out.println("Id:"+id);
   System.out.println("Name:"+name);
   System.out.println("address:"+address);
   System.out.println("course:"+course);
   System.out.println("fees:"+fees);
   }
}  //end class
   public class Demo {
	   public static void main(String []args) {
	   
	   int id,n;
	   String name,address,course;
	   float fees;
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of student you want to enter");
	   n=sc.nextInt();
	   
	   for(int i=1;i<=n;i++)
	   {
	  
		   System.out.println("----------------------");
		   System.out.println("Enter id:");
		   id=sc.nextInt();
		   
		   sc.nextLine(); //it will consume the delimeter(enter)
		   
		   System.out.println("Enter name:");
		   name=sc.nextLine();
		   System.out.println("Enter address:");
		   address=sc.nextLine();
		   System.out.println("Enter course:");
		   course=sc.nextLine();
		   System.out.println("Enter fees:");
		   fees=sc.nextFloat();
		   //annonymous object creation
		   Student obj=new Student();
		   obj.setData(id,name,address,course,fees);
		   System.out.println("obj object:" +obj);
		   System.out.println("--------------------------");
		   obj.displayData();
		   
		   
	   }
   }
}

