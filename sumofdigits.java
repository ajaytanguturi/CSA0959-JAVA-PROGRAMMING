import java.util.*;
class sumofdigits{
public static void main(String args[]){
int num,digits,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter number: ");
num=s.nextInt();
while(num>0){
digits=num%10;
sum=sum+digits;
num=num/10;
}
System.out.println("Sum of digits : "+ sum);
}
}
