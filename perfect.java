import java.util.*;
class perfect{
    public static void main(String args[]){
        int i,sum=0,num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        num=s.nextInt();
        for(i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("a perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
