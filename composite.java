import java.util.*;
class composite{
public static void main(String args[]){
int flag,m,n,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter the starting number: ");
m=s.nextInt();
System.out.println("enter the ending number: ");
n=s.nextInt();
for(i=m;i<=n;i++){
flag=0;
for(j=2;j<i;j++){
if(i%j==0){
flag=1;
break;
}
}
if(flag!=0){
System.out.println(i);
}
}
}
}
