import java.util.*;
class reverse{
public static void main(String args[]){
String data,datatemp=" ";
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter string: ");
data=s.nextLine();
for(i=data.length()-1;i>=0;i--){
datatemp=datatemp+data.charAt(i);
}
System.out.println("Reversed string is : "+ datatemp);
}
}
