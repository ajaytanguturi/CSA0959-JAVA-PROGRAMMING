import java.util.*;
class invertedpyramid {
public static void main(String args[]){
int i,j,k,r,n;
char c;
Scanner s=new Scanner(System.in);
System.out.print("enter no of rows :");
r=s.nextInt();
System.out.println("enter choice(*,n):");
c=s.next().charAt(0);
switch(c){
case '*':
for(i=0;i<=r-1;i++){
for(j=0;j<=i;j++){
System.out.print(" ");
}
for(k=0;k<=r-1-i;k++){
System.out.print("* ");
}
System.out.println();
}
break;
case 'n':
System.out.println("enter the n value: ");
n=s.nextInt();
for(i=0;i<=r-1;i++){
for(j=0;j<=i;j++){
System.out.print(" ");
}
for(k=0;k<=r-1-i;k++){
System.out.print(n+" ");
n=n+10;
}
System.out.println();
}
break;
default:
System.out.println("enter valid choice!");
}

}
}
