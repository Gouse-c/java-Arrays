import java.util.Scanner;
class 2DJaggedArrayCreationStoringPrinting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[m][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println("Enter marks of class " + i + " of student "+ j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The marks of students are : ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
