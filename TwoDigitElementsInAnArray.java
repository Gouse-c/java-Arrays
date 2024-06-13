import java.util.Scanner;
class TwoDigitElementsInAnArray
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
		System.out.println("The Two Digit elements in the array is : ");
		for(int i=0;i<n;i++)
		{
			if(a[i]>9 && a[i]<99)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}