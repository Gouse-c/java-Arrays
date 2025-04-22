import java.util.Scanner;
public class DuplicateElementsInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println("Duplicates:");
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]) {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
        sc.close();
    }
}
