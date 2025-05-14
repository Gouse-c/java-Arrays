import java.util.Scanner;
import java.util.ArrayList;
class IntersectionOfTwoArrays{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    System.out.print("\nEnter the size of 1st array : ");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		System.out.print("\nEnter the size of 2nd array : ");
		int size2=sc.nextInt();
		if(size2<0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		int b[]=new int[size2];
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<b.length;++i){
			b[i]=sc.nextInt();
		}
		System.out.print("\n1st Array => ");
		for(int item:a)
			System.out.print(item+" ");
		
		System.out.print("\n2nd Array => ");
		for(int item:b)
			System.out.print(item+" ");
		ArrayList<Integer>commonElements=findCommonElements(a,b);
		System.out.println("\nInter Section Of Two Arrays => "+commonElements);
	}
	public static ArrayList<Integer> findCommonElements(int a[],int b[]){
		ArrayList<Integer>commonElements=new ArrayList<Integer>();
		ArrayList<Integer>list1=new ArrayList<Integer>();
		ArrayList<Integer>list2=new ArrayList<Integer>();
		for(int item:a){
			list1.add(item);
		}
		for(int item:b){
			list2.add(item);
		}
		for(Integer item:list1){
			if(list2.contains(item)){
				commonElements.add(item);
			}
		}
		return commonElements;
	}
}