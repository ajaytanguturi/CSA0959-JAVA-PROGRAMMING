import java.util.*;
public class totalbalance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of 2000 notes:");
        int a1=s.nextInt();
        System.out.println("enter no of 500 notes:");
        int a2=s.nextInt();
        System.out.println("enter no of 200 notes:");
        int a3=s.nextInt();
        System.out.println("enter no of 100 notes:");
        int a4=s.nextInt();
        int total=(a1*2000)+(a2*500)+(a3*200)+(a4*100);
        System.out.println("total balance is :"+total);
        
    }
}
