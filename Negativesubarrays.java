import java.util.*;
public class Negativesubarrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array:");
        n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println("Neg subarrays is:" +count);
    }
    
}
