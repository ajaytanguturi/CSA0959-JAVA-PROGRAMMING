import java.util.*;
public class lcmandgcd {
    public static void main(String[] args) {
        int i,n;
        Scanner s=new Scanner(System.in);
        System.out.println("how many numbers required:");
         n=s.nextInt();
        if(n<2){
            System.out.println("atleast enter 2 values!");
        }
        int[] data=new int[n];
        System.out.println("enter numbers:");
        for(i=0;i<n;i++){
            data[i]=s.nextInt();
        }
        int gcd=data[0];
        int lcm=data[0];
        for(i=0;i<n;i++){
            int a=gcd;
            int b=data[i];
            int temp;
            while(b!=0){
                temp=b;
                b=a%b;
                a=temp;
            }
            gcd=a;
            int templcm=lcm;
            a=templcm;
            b=data[i];
            int gcdforlcm=gcd;
            while(b!=0){
                temp=b;
                b=a%b;
                a=temp;
            }
            gcdforlcm=a;
            lcm=(templcm*data[i])/gcdforlcm;
        }
        System.out.println("gcd is :"+gcd);
        System.out.println("lcm is :"+lcm);
        
    }
    
}
