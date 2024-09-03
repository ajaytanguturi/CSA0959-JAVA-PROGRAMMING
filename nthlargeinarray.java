import java.util.*;
class nthlargeinarray{
    public static void main(String args[]){
        int size;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array:");
        size=s.nextInt();
        int[] a=new int[size];
        System.out.println("enter elements!");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<=i;j++){
                if(a[j]>a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("enter nth value:");
        int n=s.nextInt();
        int large=a[(n-1)];
        System.out.println("nth largest value is: "+large);
    }
}
