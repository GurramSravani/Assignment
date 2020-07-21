import java.util.Scanner;

public class Pattern_Num1
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nb of row: ");
		int r = sc.nextInt();
		
		for (int i = 0; i < r; i++) 
		{
			for (int j = r - i; j > 0; j--)
			{
				System.out.print("  ");
			}
			for (int k = r - i; k <= r; k++)
			{
				System.out.print(k+" ");
			}
			for (int n = r - i, m = r - 1; n < r; n++, m--)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}

	}

}