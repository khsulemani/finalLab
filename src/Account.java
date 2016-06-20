import java.util.Scanner;
/**
 * 
 * @author Khizar 
 * This is an abstract class. And used to get all inforamtion of account.
 */
abstract public class Account {
	
	protected int number;
	protected int bal;
	
	Scanner input=new Scanner(System.in);
	/**
	 * This method is used to give the value if number form owner.
	 * @return number:  The value of number that get from the user and return it.
	 */
	public int getNumber()
	{
		System.out.print("Enter the Number");
		number=input.nextInt();
		return number;
	}
	/**
	 * This method is used to get the balance from the owner and retruns through bal variable.
	 * @return
	 */
	
	public int getBal()
	{
		System.out.print("Enter the Balance");
		bal=input.nextInt();
		return bal;
	}
	
	/**
	 *  This method have Person class object and gives two variable info for owner. 
	 * @return
	 */
	
	public Person getOwner()
	{
		Person person=new Person("Khizar",123);
		return person;
	}
	
	/**
	 * 
	 * @param d : This is an integer variable
	 */
	public void	deposit(int d)
	{
		System.out.print("The d value"+d);
		
	}
	
	/**
	 * This is an abastact method that return boolean according to account variable. Because it is absatrcut function so it has no body. 
	 * @param d
	 * @return
	 */
	abstract public boolean withdraw(int d);
	
		

}
