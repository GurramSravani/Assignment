import java.util.Scanner;
class PatternNum
{
	public static void main(String[] args)
    	{
    		Scanner scanner = new Scanner(System.in);
 		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Required pattern: ");
 		for (int i= rows; i>=0 ; i--)
    		{
    			for (int j=1; j<=i; j++)
    			{
				System.out.print(j+ " ");
    			}
			System.out.println();
		}
	}
}