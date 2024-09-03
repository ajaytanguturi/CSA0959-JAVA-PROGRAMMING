import java.util.*;
class factorsandnthfac{
    public static void main(String args[]){
        int c=0,n,k;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        n=s.nextInt();
        System.out.println("give nth number:");
        k=s.nextInt();
        int fac=-1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c=c+1;
                if(c==k){
                    fac=i;  
                }
            }
        }
        System.out.println("the no of factors are :"+c);
        if(fac!=-1){
            System.out.println("the nth factor is :"+fac);
        } else{
            System.out.println("no factors found:");
        }
    }
}
