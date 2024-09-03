import java.util.*;
class match{
public static void main(String arg[]){
String u1, u2;
Scanner s= new Scanner(System.in);
System.out.println("enter username: ");
u1=s.nextLine();
System.out.println("Re enter username: ");
u2=s.nextLine();
if(u1.equals(u2)){
System.out.println("Valid user");
}
else{
System.out.println("Invalid user");
}
}
}
