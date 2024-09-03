import java.util.*;
class count{
public static void main(String args[]){
String str;
int v=0,c=0,d=0,sp=0,i;
Scanner s=new Scanner(System.in);
System.out.println("enter the string: ");
str=s.nextLine();
for(i=0;i<str.length();i++){
if(str.charAt(i)>='a'&& str.charAt(i)<='z'||str.charAt(i)>='A'&& str.charAt(i)<='Z'){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
v=v+1;
}
else{
c=c+1;
}
}
else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
d=d+1;
}
else{
sp=sp+1;
}
}
System.out.println("vowels are : "+ v);
System.out.println("consonants  are : "+ c);
System.out.println("digits are : "+ d);
System.out.println("special characters  are : "+ sp);
}
}


