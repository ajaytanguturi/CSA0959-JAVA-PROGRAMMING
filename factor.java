import java.util.*;
class factor{
public static void main(String args[]){
int c=0,n,i;
Scanner s =new Scanner(System.in);
System.out.println("enter the number: ");
n=s.nextInt();
for(i=1;i<=n;i++){
if(n%i==0){
c=c+1;
}
}
System.out.println(c);
}
}
