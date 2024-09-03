import java.util.*;
class days{
public static void main(String arg[]){
int n,years,rmdays,weeks,days;
Scanner s=new Scanner(System.in);
System.out.print("enter no of days: ");
n=s.nextInt();
years=n/365;
rmdays=n%365;
weeks=rmdays/7;
days=rmdays%7;
System.out.println("no of years are : "+ years);
System.out.println("no of weeks are : "+weeks);
System.out.println("no of days are : "+days);
}
}
