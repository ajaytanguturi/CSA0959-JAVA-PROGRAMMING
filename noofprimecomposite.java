import java.util.*;
class noofprimecomposite{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,i,j;
        System.out.println("enter size:");
        n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter "+n+" elements");
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int p=0,c=0;
        for(i=0;i<n;i++){
            int num=a[i];
            if(num<=1){
                continue;
            }
            int f=1;
            for(j=2;j<num;j++){
                if(num%j==0){
                    f=0;
                    break;
                }
            }
            if(f==1){
                p++;
            }
            else{
                c++;
            }
        }
        System.out.println("the num of prime num are:"+p);
        System.out.println("the num of composite num are: "+c);
        
    }
}
