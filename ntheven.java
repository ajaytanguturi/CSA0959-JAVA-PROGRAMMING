import java.util.Scanner;
public class ntheven {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter num:");
        num=s.nextInt();
        int result;
        result=2*num;
        System.out.println("the "+num+" even num is:"+result);
    } 
}
