import java.util.*;
public class halfdiamond {
    public static void main(String args[]){
        int n,i,j,k=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size:");
        n=s.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k++ +" ");
                
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--){
            for(j=1;j<=i;j++){
                System.out.print(k++ +" ");
               
            }
            System.out.println();
        }
        
    }
    
}
