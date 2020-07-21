//program to print the prime numbers from 0 to n.
import java.util.*;
class FirstNPrimeNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to print prime numbers from 2 to given number");
		int n=sc.nextInt();
		int d[]=new int[n];
		System.out.println("First N prime numbers are: ");
		for(int i=1;i<n;i++)
		{
			int c=0;
			for(int j=1;j<n;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			{
				System.out.print(i+"\t");
				d[i]=i;
			}
			
		}
	}
}