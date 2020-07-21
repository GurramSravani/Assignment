import java.util.*;
class AscendingNumber
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
		System.out.print("Numbers in an array before sorting: ");
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+"\t");
		Arrays.sort(arr);
		System.out.print("Numbers in an ascending order: ");
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+"\t");
	}
}