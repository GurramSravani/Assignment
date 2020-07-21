import java.util.*;
class Armstrong
{  
	public static void main(String[] args)  
	{  
		Scanner scanner=new Scanner(System.in);
		int sum=0,rem,temp; 
		System.out.print("Enter a number: ");
		int num=scanner.nextInt();
		temp=num;  
		while(num>0)  
    		{  
    			rem=num%10;  
    			num=num/10;  
    			sum=sum+(rem*rem*rem);  
    		}  
   		if(temp==sum)  
    		System.out.println(temp+" is an armstrong number");   
    		else  
        	System.out.println(temp+" is not an armstrong number");   
   	}  
}  