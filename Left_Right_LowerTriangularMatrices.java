import java.util.Scanner;
class Left_Right_LowerTriangularMatrices{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nResulted Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nLeft Lower Triangular Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				if(i==0||j==0||i+j==a.length-1){
					System.out.print(a[i][j]+" ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\nRight Lower Triangular Matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				if(i==0||j==a.length-1||i==j){
					System.out.print(a[i][j]+" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}