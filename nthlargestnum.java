
import java.util.*;
class nthlargestnum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int size,i,j;
        System.out.println("enter size of array:");
        size=s.nextInt();
        System.out.println("enter "+size+" elements");
        int[] a=new int[size];
        for(i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter nth largest index:");
        int n=s.nextInt();
        for(i=0;i<size;i++){
            for(j=i+1;j<=i;j++){
                int temp;
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        if(n<=size){
            System.out.println("the "+n+" largest num in array is "+a[n-1]);
        }
        else{
            System.out.println("index out of bounds");
        }
        
        
    }
}
