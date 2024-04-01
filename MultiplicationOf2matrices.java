import java.util.Scanner;
class MultiplicationOf2matrices
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of rows of matrix 1: ");
		int m = sc.nextInt();
		System.out.println("Enter the size of columns of matrix 1 : ");
		int n= sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the matrix elements : ");
		for(int i=0;i<m;i++)
		{			
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the marks of class "+i+ "of student :"+j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the size of the rows of 2 matrix :");
		int p=sc.nextInt();
		System.out.println("Enter the size of the columns of 2 matrix :");
		int q=sc.nextInt();
		int b[][]=new int[p][q];
		System.out.println("Enter the matrix elements : ");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.println("Enter the marks of class "+i+ "of student :"+j);
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[3][3];
		System.out.println("Resulted Matrix is :");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				for(int k=0;k<=c.length-1;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		