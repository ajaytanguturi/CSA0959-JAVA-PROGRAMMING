import java.util.*;
class permutationstring{
    public static void main(String args[]){
        String input;
        Scanner s=new Scanner(System.in);
        System.out.println("enter string:");
        input=s.nextLine();
        print_permut(input);
        s.close();
    }
    static void print_permut(String str){
        permut(str," ");
    }
    static void permut(String word,String prefix){
        if(word.length()==0){
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<word.length();i++){
                char currentchar=word.charAt(i);
                String rem=word.substring(0,i)+word.substring(i+1);
                permut(rem,prefix+currentchar);
            }
        }
    }
}
