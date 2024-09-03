import java.util.Scanner;

public class meanmed {
    public static void main(String[] args) {
        int size,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array");
        size=s.nextInt();
        int[] data=new int[size];
        System.out.println("enter elements:");
        for(i=0;i<size;i++){
            data[i]=s.nextInt();
        }
        double mean=0,median=0,mode=0;
        int sum=0,count=0;
        for(i=0;i<size;i++){
                sum=sum+data[i];
                count++;  
        }
        mean=sum/count;
        System.out.println("mean is :"+mean);
        for(i=0;i<size;i++){
            for(j=i+1;j<size-i;i++){
                int temp=0;
                if(data[i]>data[j]){
                    temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
        if(size%2==0){
            median=(data[size/2-1]+data[size/2])/2.0;
        }
        else{
            median=data[size/2];
        }
    
        System.out.println("median is :"+median);
    }
}
