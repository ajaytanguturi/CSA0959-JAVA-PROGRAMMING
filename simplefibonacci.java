import java.util.*;
public class simplefibonacci {
    public static void main(String[] args) {
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the terms of fibonacci series:");
        n=s.nextInt();
        if(n<0){
            System.out.println("enter valid number:");
        }
        else{
            System.out.println("fibonacci series :");
            int fn=0;
            int sn=1;
            for(i=1;i<=n;i++){
                System.out.print(fn+" ");
                
                int next_term=fn+sn;
                fn=sn;
                sn=next_term;
            }
        }
    }
    
}
