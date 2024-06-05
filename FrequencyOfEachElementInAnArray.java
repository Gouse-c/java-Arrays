import java.util.Scanner;
class FrequencyOfEachElementInAnArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		frequencyOfElements(a,n);
	}
	public static void frequencyOfElements(int a[],int n)
	{
		int fr[]=new int[n];
		int visited=-1;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
			{
				fr[i]=count;
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("  Elements   |  Frequency  ");
		System.out.println("-----------------------------------");
		for(int i=0;i<n;i++)
		{
			if(fr[i]!=visited)
			{
				System.out.println(" " + a[i] + "  |  " + fr[i]);
			}
		}
		System.out.println("-----------------------------------");
	}
}
/*
>javac FrequencyOfEachElementInAnArray.java
>java FrequencyOfEachElementInAnArray
Enter the size of the Array :
10
Enter the array elements :
20
40
50
40
60
20
10
80
70
20
-----------------------------------
  Elements   |  Frequency
-----------------------------------
 20  |  3
 40  |  2
 50  |  1
 60  |  1
 10  |  1
 80  |  1
 70  |  1
-----------------------------------
*/
