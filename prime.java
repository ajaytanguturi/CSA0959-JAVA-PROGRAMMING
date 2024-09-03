import java.util.*;
class prime{
public static void main(String args[]){
int n,i=2,f=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number: ");
n=s.nextInt();
while(i<n){
if(n%i==0){
f=1;
break;
}
i++;
}
if(f==0){
System.out.println("prime number");
}
else{
System.out.println("composite number");
}
}
}
