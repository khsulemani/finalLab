
/**
 * 
 * @author Khizar
 * This is Bank class having two methods. 1. AddAccount and 2. SelectAccount
 */
public class Bank {
	/**
	 * This method is used to describe the Account inforamtion.
	 * @param a : This is the Object of Account class. As Account is abstract class 
	 * so we cannot create their object but we create the objects of their child class.
	 * Here Saving Account ant Checking Account is the two object of Account class. 
	 */
	
	public void addAccount(Account a)
	{
		a=new SavingAccount();
		a=new CheckingAccount();
	}
	
	/**
	 * 
	 * @param no: This is an integer variable and it tells selection of the account.
	 * @return a: This is the Account Refferace which tells about the retruns the Account that user select. 
	 */
	
	public Account selectAccount(Integer no)
	{
		Account a;
		a=new SavingAccount();
		a=new CheckingAccount();
		return a;
	}

}
