import java.util.*;
class lefttriangle{
public static void main(String args[]){
int i,j,r;
Scanner s=new Scanner(System.in);
System.out.print("enter rows: ");
r=s.nextInt();
for(i=0;i<r;i++){
for(j=2*(r-i);j>0;j--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}
}
}
