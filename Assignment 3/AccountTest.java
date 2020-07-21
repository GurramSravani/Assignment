import java.util.*;
public class AccountTest
{
	public static void main(String args[]) 
	{
		Account obj = new Account();
		System.out.println("Enter the Ac no");
		Scanner scanner = new Scanner(System.in);
		long acNo = scanner.nextLong();
		obj.setAccountNo(acNo);
		System.out.println("Enter the balance");
		double bal = scanner.nextDouble();
		obj.setBalance(bal);
		System.out.println("Enter the balance to deposit");
		double depositAmount = scanner.nextDouble();
		obj.deposit(depositAmount);
		System.out.println("Enter the balance to withraw");
		double withdrawAmount = scanner.nextDouble();
		obj.withDraw(withdrawAmount);
		System.out.println("The balance= " + obj.getBalance());
	}

}