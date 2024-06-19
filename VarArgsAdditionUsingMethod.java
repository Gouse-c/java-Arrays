class Addition
{
	public void add(int...x)
	{
		int sum=0;
		for(int item:x)
		{
			sum=sum+item;
		}
		System.out.println("sum = "+sum);
	}
}
class VarArgsAdditionUsingMethod
{
	public static void main(String args[])
	{
		Addition a=new Addition();
		a.add(10,20);
		a.add(10,20,30);
		a.add(10,20,30,40);
		a.add(10,20,30,40,50);
		a.add(10,20,30,40,50,60);
		a.add(10,20,30,40,50,60,70);
	}
}