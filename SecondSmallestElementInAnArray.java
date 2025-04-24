import java.util.Scanner;
public class SecondSmallestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int min=arr[0],second=arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i]<min) {
                second=min;
                min=arr[i];
            } else if(arr[i]<second && arr[i]!=min) {
                second=arr[i];
            }
        }
        System.out.println("Second Smallest:"+second);
        sc.close();
    }
}
