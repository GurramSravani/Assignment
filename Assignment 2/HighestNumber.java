import java.util.*;
class HighestNumber
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of elements in an array: ");
		int n=scanner.nextInt();
		System.out.print("Enter the elements into an array: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("largest number: "+arr[n-1]);
	}
}