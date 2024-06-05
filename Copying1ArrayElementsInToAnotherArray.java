import java.util.Scanner;
class Copying1ArrayElementsInToAnotherArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		copyingArray(a,n);
	}
	public static void copyingArray(int a[],int n )
	{
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		System.out.println("The Elements in the b array array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}