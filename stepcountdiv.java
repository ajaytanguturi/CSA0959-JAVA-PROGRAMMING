import java.util.*;
public class stepcountdiv {
    public static void main(String[] args) {
        int n,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        n=s.nextInt();
        while(n>0){
            c++;
            if(n%2==0){
                n=n/2;
            }
            else{
                n=n-1;
            }
        }
        System.out.println("the no of steps for reaching 0 is :"+c);
    }    
}
