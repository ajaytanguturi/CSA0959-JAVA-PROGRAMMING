import java.util.*;
import java.lang.*;
public class perfectsquare {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        num=s.nextInt();
        double k=Math.sqrt(num);
        if(k==(int)k){
            System.out.println(("perfect square"));
        }
        else{
            System.out.println("not a perfect sqaure");
        }
        }
}
