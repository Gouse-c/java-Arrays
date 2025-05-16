import java.util.Scanner;
import java.util.Arrays;
public class KthSmallestAndLargestNumberInArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of arry > ");
		int size=sc.nextInt();
		if(size<0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		int a[]=new int[size];
		System.out.println("\nEnter the array elements > ");
		for(int i=0;i<size;++i){
			a[i]=sc.nextInt();
		}
		System.out.print("\nResulted Array >> ");
		for(int item:a){
			System.out.print(item+" ");
		}
		System.out.print("\nEnter K -> ");
		int k=sc.nextInt();
		Arrays.sort(a);
		int kthSmallest=a[k-1];
		int kthLargest=a[a.length-k];
		System.out.println("\n"+k+"th smallest >> "+kthSmallest);
		System.out.println("\n"+k+"th largest  >> "+kthLargest);
		
	}
}