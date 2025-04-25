import java.util.Scanner;
import java.util.HashSet;
public class LongestConsecutiveSequenceLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        HashSet<Integer> s=new HashSet<>();
        for(int x:arr) s.add(x);
        int longest=0;
        for(int x:arr){
            if(!s.contains(x-1)){
                int len=1;
                while(s.contains(x+len)) len++;
                if(len>longest) longest=len;
            }
        }
        System.out.println("Longest Consecutive Length:"+longest);
        sc.close();
    }
}
