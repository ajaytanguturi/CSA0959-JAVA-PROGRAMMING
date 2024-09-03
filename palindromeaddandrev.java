import java.util.*;
public class palindromeaddandrev {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int n =s.nextInt();
        if(n<0){
            System.out.println("enter positive num");
        }
        else{
        while(true){
            int rev=0;
            int temp=n;
            while(temp!=0){
                rev=rev*10+temp%10;
                temp/=10;
            }
            if(n==rev){
                System.out.println("palindrome:");
                break;

            }
            n=n+rev;
            System.out.println(n);
        }

    }
}
    
}
