import java.util.*;
class palindrome{
    public static void main(String args[]){
        String data,datatemp="";
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter string: ");
        data=s.nextLine();
        for(i=data.length()-1;i>=0;i--){
            datatemp+=data.charAt(i);
        }
        if(data.equals(datatemp)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
