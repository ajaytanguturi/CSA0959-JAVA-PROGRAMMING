import java.util.*;
class table{
public static void main(String arg[]){
int n,r,i;
Scanner s= new Scanner(System.in);
System.out.println("enter table value: ");
n=s.nextInt();
System.out.println("enter row value: ");
r=s.nextInt();
for(i=1;i<=r;i++){
System.out.println(i+" "+"x"+" "+n+" "+"="+" "+i*n);
}
}
}
