import java.util.Scanner;
class CheckTheMatrixSymmetricOrNot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter no.of rows : ");
		int rows=sc.nextInt();
		System.out.print("\nEnter no.of columns : ");
		int columns=sc.nextInt();
		int a[][]=new int[rows][columns];
		int b[][]=new int[columns][rows];
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
		for(int i=0;i<columns;++i){
			for(int j=0;j<rows;++j){
				b[i][j]=a[j][i];
			}
		}
		if(isSymmetricMatrix(a,b)){
			System.out.println("\nResulted Matrix Is Symmetric :)");
		}else{
			System.out.println("\nResulted Matrix Is Not Symmetric..!");
		}
	}
	public static boolean isSymmetricMatrix(int a[][],int b[][]){
		for(int i=0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				if(a[i][j]!=b[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}