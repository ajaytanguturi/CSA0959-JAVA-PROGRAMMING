import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
        }
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
s.close();
    }
}
