import java.util.*;
public class BuyingaTV {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cost1,cost2;
        while(n-- > 0){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int d=s.nextInt();
            
            cost1=a-c;
            cost2=b-d;
        
            if(cost1<cost2){
                System.out.println("First");
            }
            else if(cost2<cost1){
                System.out.println("Second");
            }
            else{
                System.out.println("Any");
            }
        
        }
        s.close();
    }
}
