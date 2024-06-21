//Find Missing Element program
class demo
{
	public static void main(String ar[])
	{
		int anser;
		int x[]={0,1,2,3,4,5};
		int sum=0;
		for(int num:x)
		{
			sum+=num; 
		}
		int total=x.length*(x.length+1);
		total/=2;
		anser=total-sum;
	System.out.println("missing alement="+anser);		
	}

}