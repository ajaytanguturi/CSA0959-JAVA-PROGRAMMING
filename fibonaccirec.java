import java.util.*;
class fibonaccirec{
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("enter number:");
        num=s.nextInt();
        int fact=factorial(num);
        System.out.println("factorial is:"+fact);
    }
}
