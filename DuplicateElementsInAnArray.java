import java.util.Scanner;
class DuplicateElementsInAnArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\nDuplicates are :");
		for(int i=0;i<=a.length-1;i++)
		{
			int target=a[i];
			int count=0;
			if(a[i]==-1)
			{
				continue;
			}
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(target==a[j])
				{
					count++;
					a[j]=-1;
				}
				
			}
			if(count>0)
				{
					System.out.println("\n"+a[i]);
				}
		}
	}
}