import java.util.Scanner;
class EvenElementsIndexesInAnArray
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
		System.out.println("The Even elements indexes in the array is : ");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}