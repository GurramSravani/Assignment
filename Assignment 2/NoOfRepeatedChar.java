import java.util.*;
class NoOfRepeatedChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int count=0;
		String temp="";
		for(int i=0;i<str.length();i++)
		{
		char c1=str.charAt(i);
		for(int j=i;j<str.length();j++)
			{
			char c2=str.charAt(j);
			if(c1==c2 && temp.indexOf(c1)==-1)
				{
					count++;
				}
			}
			if(temp.indexOf(c1)==-1)
			{
			temp=temp+c1;
	
		System.out.println(c1+"........"+count);
		count=0;
		}
		}
	}
}
