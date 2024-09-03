import java.util.*;
class compositenum{
public static void main(String args[]){
int flag,m,n,i,j;
Scanner s=new Scanner(System.in);
System.out.print("enter starting range: ");
m=s.nextInt();
System.out.print("enter ending range: ");
n=s.nextInt();
for(i=m;i<=n;i++){
flag=0;
for(j=2;j<i;j++){
if(i%j==0){
flag=1;
}
}
if(flag!=0){
System.out.println(i);
continue;
}
}
}
}
