class RangePrimeNumber
{
	public static void main(String args[])
	{
		int count;
		System.out.println("Range of Prime Numbers from 2 to 200 are: ");
		for(int i=2;i<=200;i++)
		{	
			count=0;
			for(int j=1;j<=i;j++)	
			{
				if(i%j==0)
					count=count+1;
			}
			if(count==2)
				System.out.print(i+"\t");
		}
	}
}