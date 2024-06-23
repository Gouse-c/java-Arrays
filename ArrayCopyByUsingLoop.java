import java.util.Scanner;
class ArrayCopyByUsingLoop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the size of array A : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("\nEnter the array Elements of A : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Elements in the array A is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		System.out.println("The Elements in the array B is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
}