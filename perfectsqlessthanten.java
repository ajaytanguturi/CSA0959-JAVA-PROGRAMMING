import java.util.*;
public class perfectsqlessthanten {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter starting range:");
        int m=s.nextInt();
        System.out.print("enter ending range:");
        int n=s.nextInt();
        for(int i=1;i*i<=n;i++){
            int sq=i*i;
            if(sq>=m){
                int sum=0;
                int temp=sq;
                while(temp!=0){
                    sum+=temp%10;
                    temp/=10;
                }
                if(sum<10){
                    System.out.println(sq);
                }
            }
            
        }
    }
    
}
