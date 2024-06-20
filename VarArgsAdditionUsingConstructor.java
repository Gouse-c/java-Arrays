class Addition
{
	public Addition(int...x)
	{
		int product=1;
		for(int item:x)
		{
			product=product*item;
		}
		System.out.println(product);
	}
}
class VarArgsAdditionUsingConstructor
{
	public static void main(String args[])
	{
		Addition a2=new Addition(10,20);
		Addition a3=new Addition(10,20,30);
		Addition a4=new Addition(10,20,30,40);
		Addition a5=new Addition(10,20,30,40,50);
		Addition a6=new Addition(10,20,30,40,50,60);
	}
}