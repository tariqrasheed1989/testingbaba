package misc;

public class ConstructorPractice 
{
	String name;
	int empID;
	
	ConstructorPractice(String naam, int emp_ID)
	{
		name=naam;
		empID=emp_ID;
	}
	public static void main(String[] args) 
	{
		ConstructorPractice emp1=new ConstructorPractice("Tariq", 101);
		ConstructorPractice emp2=new ConstructorPractice("Rahul", 123);
		System.out.println("Employee 1:"+emp1.name+" "+emp1.empID);
		System.out.println("Employee 2:"+emp2.name+" "+emp2.empID);
	}
	
}
