import java.util.*;
public class endsubstring {
    public static void main(String[] args) {
        String str;
        Scanner s =new Scanner(System.in);
        System.out.println("enter string:");
        str=s.nextLine();
        String[] data=str.split(" ");
        System.out.println(data[(data.length)-1].length());
        s.close();
    }
    
}
