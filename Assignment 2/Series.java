import java.util.*;
class Series
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number to print series upto the number: ");
		int number=scanner.nextInt();	
		for(int i=1;i<=number;i++)
		System.out.print((i*i*i)+"\t");
	}
}