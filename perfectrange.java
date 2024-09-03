import java.util.*;
class perfectrange{
public static void main(String args[]){
    int sum=0,c=0,i,j,m,n,k;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the starting value: ");
    m=s.nextInt();
    System.out.println("enter ending value: ");
    n=s.nextInt();
    System.out.println("enter range:");
    k=s.nextInt();
    for(i=m;i<=n;i++){
            for(j=1;j<i-1;j++){
                if(i%j==0){
                sum=sum+j;
                }
            }
            if(sum==i){
            System.out.println(i);
            c=c+1;
            }

            if(c==k){
            break;
            }
        sum=0;
        }
    }
}
