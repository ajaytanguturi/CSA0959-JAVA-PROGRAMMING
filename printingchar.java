import java.util.*;
class printingchar{
public static void main(String args[]){
String str;
String v="",c="",d="",sp="";
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter the string: ");
str=s.nextLine();
for(i=0;i<str.length();i++){
if(str.charAt(i)>='a'&& str.charAt(i)<='z'||str.charAt(i)>='A'&& str.charAt(i)<='Z'){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
v+=str.charAt(i);
}
else{
c+=str.charAt(i);
}
}
else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
d+=str.charAt(i);
}
else{
sp+=str.charAt(i);
}
}
System.out.println("vowels are : "+ v);
System.out.println("consonants  are : "+ c);
System.out.println("digits are : "+ d);
System.out.println("special characters  are : "+ sp);
}
}
