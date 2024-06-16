import java.util.Scanner;
class SumOfOddIndexesInAnArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int odd_sum=0;
		System.out.println("The Sum of the odd elements is : ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0)
			{
				odd_sum=odd_sum+a[i];
			}
		}
		System.out.println(odd_sum);
	}
}