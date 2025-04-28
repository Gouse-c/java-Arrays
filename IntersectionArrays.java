import java.util.Scanner;
import java.util.HashSet;
public class IntersectionArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),arr1[]=new int[n1];
        int n2=sc.nextInt(),arr2[]=new int[n2];
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<n2;i++) arr2[i]=sc.nextInt();
        HashSet<Integer> s=new HashSet<>();
        for(int x:arr1) s.add(x);
        System.out.println("Intersection:");
        for(int x:arr2) if(s.contains(x)) System.out.print(x+" ");
        sc.close();
    }
}
