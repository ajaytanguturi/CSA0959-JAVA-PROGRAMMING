import java.util.*;
class vote{
public static void main(String arg[]){
int n,y;
Scanner s=new Scanner(System.in);
System.out.println("enter age : ");
n=s.nextInt();
if(n>=18){
System.out.println("Eligible to vote");
}
else if(n<=0){
    System.out.println("enter positive age!");
}
else{
y=18-n;
System.out.println("not eligible to vote");
System.out.println("eligible to vote after "+y+" years");
}
}
}
