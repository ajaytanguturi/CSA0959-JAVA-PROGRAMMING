import java.util.*;
class perfectnum{
public static void main(String args[]){
int sum=0,i,j,m,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the starting number: ");
m=s.nextInt();
System.out.println("enter the ending number: ");
n=s.nextInt();
for(i=m;i<=n;i++){
for(j=1;j<=i-1;j++){
if(i%j==0){
sum=sum+j;
}
}
if(sum==i){
System.out.println(i);
}
sum=0;
}
}
}
