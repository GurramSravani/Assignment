import java.util.*;
class NumInWords
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int n = in.nextInt();
		System.out.println(word(n));
	}
	static String word(int n)
	{
		String words = "";
		String ones[] = {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
		String tens[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		if((n/10000000)>0)
		{
			words = words+word(n/10000000)+"crore ";
			n = n%10000000;
		}
		if((n/100000)>0)
		{
			words = words+word(n/100000)+"lakhs ";
			n = n%100000;
		}
		if((n/1000)>0)
		{
			words = words+word(n/1000)+"Thousands ";
			n = n%1000;
		}
		if((n/100)>0)
		{
			words = words+word(n/100)+" Hundred ";
			n = n%100;
		}
		if(n<20)
		{
			words = words+ones[n];
		}
		else
		{
			words = words+tens[n/10];
			if((n%10)>0)
			{
				words = words+" "+ones[n%10]+" ";
			}
		}
		return words;
 	}
}