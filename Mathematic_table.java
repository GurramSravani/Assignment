import java.util.Scanner;
public class Mathematic_table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to print table: ");
		int num = sc.nextInt();
		System.out.print("Enter the last nuumber: ");
		int b=sc.nextInt();
	        for(int i=1;i<=b;i++)
	        {
	            System.out.printf("%d * %d = %d \n", num,i,num*i);
	        }
	    }
}