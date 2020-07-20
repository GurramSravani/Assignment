import java.util.Scanner;
class Factorial
{  
	public static void main(String args[])
	{  
		int factorial=1;  
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to calculate factorial: ");
		int number=scanner.nextInt();   
		for(int i=number;i>=1;i--)
		{    
      			factorial=factorial*i;    
  		}    
		System.out.println("Factorial of a "+number+" is : "+factorial);    
	}  
} 