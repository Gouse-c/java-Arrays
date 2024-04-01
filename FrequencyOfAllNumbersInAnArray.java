import java.util.Scanner;
class FrequencyOfAllNumbersInAnArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int target=a[i];
			if(a[i]==-1)
			{
				continue;
			}
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(a[j]==target)
				{
					count++;
					a[j]=-1;
				}
			}
			System.out.println("The frequency of the "+target+" is : "+count);
		}
	}
}