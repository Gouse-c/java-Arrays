import java.util.Scanner;
import java.util.Arrays;
public class ArraysEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr1[]=new int[n],arr2[]=new int[n];
        for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<n;i++) arr2[i]=sc.nextInt();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2)?"Equal":"Not Equal");
        sc.close();
    }
}
