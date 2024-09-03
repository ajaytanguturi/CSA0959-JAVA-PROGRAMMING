import java.util.*;
public class expenditure {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=0,hm=0;
        int[] arr=new int[3];
        for(int i=1;i<=n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int sum=a+b+c;
            if(sum>max){
                max=sum;
                hm=i;
                arr[0]=a;
                arr[1]=b;
                arr[2]=c;
            }
        }
        System.out.println(hm);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr+" ");
        }
    }
}

