import java.util.*;
public class conversions {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        char c;
        System.out.println("enter choice(1,2) :");
        c=s.next().charAt(0);
        switch(c){
            case '1':
            System.out.println("enter number:");
            n=s.nextInt();
            s.nextLine();
            System.out.println("Decimal num:"+n);
            System.out.println("Binary num:"+Integer.toBinaryString(n));
            System.out.println("Octal number:"+Integer.toOctalString(n));
            break;
            case '2':
            String str;
            System.out.println("enter binary number:");
            str=s.nextLine();
            int dec=Integer.parseInt(str,2);
            String oc=Integer.toOctalString(dec);
            System.out.println("binary:"+str);
            System.out.println("Decimal"+dec);
            System.out.println("octal :"+oc);
            break;
            default:
            System.out.println("enter correct choice:");
            break;

    }
}
}
