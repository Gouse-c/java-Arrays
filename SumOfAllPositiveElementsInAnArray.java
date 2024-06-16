import java.util.Scanner;
class SumOfAllPositiveElementsInAnArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Sum of all positive Elements in An array is :");
		double sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}
				