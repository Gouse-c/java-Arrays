import java.util.Scanner;
class SumOf2DigitsNumbers
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
		System.out.println("The sum of the two digit elements in the array is : ");
		double sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>9 && a[i]<99)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}