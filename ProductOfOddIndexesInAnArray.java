import java.util.Scanner;
class ProductOfOddIndexesInAnArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int odd_product=1;
		System.out.println("The product of add indexes is : ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0)
			{
				odd_product=odd_product*a[i];
			}
		}
		System.out.println(odd_product);
	}
}