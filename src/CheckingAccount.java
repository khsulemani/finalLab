
/**
 * 
 * @author Khizar
 *This is inhereted class form Account. This gives the information about Account Checking.
 */
public class CheckingAccount extends Account {
	 
	
	public int chargeRate;
	
	/**
	 * "This method is used for pay charge"
	 */
	public void payCharge()
	{
		System.out.print("This method is used for pay charge");	
	}
	
	/**
	 * 
	 * @param no : This perameter is tells about the number that user gives.
	 * @param ir : This is an Real variable.
	 * @param o  : This is Person class refferance.
	 */
	public void SavingsAccount( Integer no, int ir, Person o)
	{
		
	}
	
	
	public boolean withdraw(int d)
	 {
        boolean result=true;
		return result;
	 }

}
