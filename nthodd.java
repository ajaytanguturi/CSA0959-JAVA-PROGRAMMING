import java.util.*;
public class nthodd {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter num:");
        num=s.nextInt();
        int result;
        result=(2*num)-1;
        int y=result+(2*num);
        System.out.println("the "+num+" odd num is:"+result);
        System.out.println("the "+num+" odd num after "+num+" numbers is :"+y);
    }
    
}
