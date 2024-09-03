import java.util.*;
class skip{
public static void main(String arg[]){
int m,n,k1,i;
Scanner s=new Scanner(System.in);
System.out.print("enter starting range:");
m=s.nextInt();
System.out.print("enter closing range:");
n=s.nextInt();
System.out.print("enter skipping value: ");
k1=s.nextInt();
for(i=m;i<=n;i++){
if(i==k1){
continue;
}
else{
System.out.println(i);
}
}
}
}
