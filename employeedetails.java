package oopsconcept;

class employee {
int id;
String name,designation;
double basicsalary;

public employee(int id,String name,String designation,double basicSalary)
{
	this.id=id;
	this.name=name;
	this.designation=designation;
	this.basicsalary=basicSalary;
	
}
public void display()
{
	System.out.println("Id:"+id+" "+"Name:"+name+" "+"Designation:"+designation+" "+"basicSalary:"+basicsalary);
}
}
public class employeedetails {
	public static void main(String []args) {
		employee emp1=new employee(101,"Sanket","Manager",20000);
		employee emp2=new employee(102,"Sujit","Manager",20000);
		emp1.display();
		emp2.display();
	}
}
