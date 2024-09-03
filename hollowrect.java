import java.util.*;
class hollowrect{
public static void main(String args[]){
int i,j,m,n;
Scanner s=new Scanner(System.in);
System.out.print("enter the rows: ");
m=s.nextInt();
System.out.print("enter the col: ");
n=s.nextInt();
for(i=1;i<=m;i++){
for(j=1;j<=n;j++){
if(i==1||i==m||j==1||j==n){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println();
}
}
}
