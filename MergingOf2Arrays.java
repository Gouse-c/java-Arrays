import java.util.Scanner;
class MergingOf2Arrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of n1 : ");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("\nEnter the Array Elements of A :  ");
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of n2 : ");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		System.out.println("\nEnter the Array Elements of B : ");
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		int n3=n1+n2;
		int mergedArray[]=new int[n3];
		for(int i=0;i<n1;i++)
		{
			mergedArray[i]=a[i];
		}
		for(int i=0;i<n2;i++)
		{
			mergedArray[n1+i]=b[i];
		}
		System.out.println("\nEnter the Array Elements of A and B after Merging is : ");
		for(int item : mergedArray)
		{
			System.out.println(item);
		}
	}
}