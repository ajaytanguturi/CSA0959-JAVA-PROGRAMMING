import java.util.*;
public class Array_checking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        int count=1;
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                count++;
            }
        }
        System.out.println("count is" +count);
    }
}
