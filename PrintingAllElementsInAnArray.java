import java.util.Scanner;
class PrintingAllElementsInAnArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The elementsin the array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}