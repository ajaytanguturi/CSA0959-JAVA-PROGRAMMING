import java.util.*;
public class removevowels{
    public static void main(String args[]){
       String str;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the string:");
       str=s.nextLine();
       for(int i=0;i<str.length()-1;i++){
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
               continue;
           }
           else{
               System.out.print(str.charAt(i));
           }
       }
       s.close();
    }
    }
