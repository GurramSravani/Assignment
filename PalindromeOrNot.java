import java.util.*;
class PalindromeOrNot
{
	public static void main(String args[])
	{
		int rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num;	
		while(temp>0)
		{
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(num==sum)
		System.out.println(num+" is a Palindrome");
		else
		System.out.println(num+" is not a palindrome");
	}
}