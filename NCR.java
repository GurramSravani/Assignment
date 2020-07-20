import java.util.Scanner;
class NCR
{  
	static int nCr(int n,int r)
	{
		return factorial(n)/(factorial(r)*factorial(n-r));
	}

	static int factorial(int n)
	{	 
		int factorial=1;
		for(int i=n;i>=1;i--)
      		factorial=factorial*i; 
		return factorial;   
	}

	public static void main(String args[])
	{  
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a n and r values to calculate nCr: ");
		int n=scanner.nextInt();
		int r=scanner.nextInt();      
		System.out.println(n+"C"+r+" is : "+ nCr(n,r));    
	}  
} 