import java.util.*;
class searching{
public static void main(String args[]){
String str;
char k;
int i,f=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the string: ");
str=s.nextLine();
System.out.println("enter searching element: ");
k=s.next().charAt(0);
for(i=0;i<str.length()-1;i++){
if(k==str.charAt(i)){
System.out.println("yes, "+k+" is present at index "+i);
f=1;
break;
}
}
if(f==0){
System.out.println("no, "+k+" is not present in the string");
}
}
}
