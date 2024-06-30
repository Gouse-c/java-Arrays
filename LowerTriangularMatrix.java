import java.util.Scanner;
class LowerTriangularMatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the rows : ");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				//System.out.println("Enter the marks of class-"+i+ "of student "+j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Upper triangle matrix elements are : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}