import java.util.Scanner;
/**
 * 
 * @author Khizar
 *This is the person class. And it tells about the Person Information.
 */

public class Person {
	
	private String name;
	private int Salary;

	
	
	Scanner input=new Scanner(System.in);
	/**
	 * This is peramteric Constractor that have two variables.
	 * @param n: This is String peramerters.
	 * @param s: This is Real Perameters.
	 */
	public Person(String n,int s)
	{
		
		name=n;
		Salary=s;
	}
	
	/**
	 * This method is used to get the name from the user.
	 * @return name: It retrun user name.
	 */
	public String getName()
	{
		System.out.print("Enter the name");
		name=input.nextLine();
		return name;
	}

	/**
	 * This method it used to get the user salary from the user.
	 * @return salary: Return the user Salary.
	 */
	public int  getSalary()
	{
		System.out.print("Enter the salary");
		Salary=input.nextInt();
		return Salary;	
	}
	
	
}
