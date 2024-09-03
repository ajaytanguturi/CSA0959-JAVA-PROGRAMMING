import java.util.*;
public class permutations {
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void per(int a[],int t){
        if(t==a.length){
            print(a);
            return;
        }
        for(int i=t;i<a.length;i++){
            swap(a,i,t);
            per(a,t+1);
            swap(a,i,t);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size;
        System.out.println("enter size of numbers");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.print("enter number:");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        per(a,0);
    }
}
