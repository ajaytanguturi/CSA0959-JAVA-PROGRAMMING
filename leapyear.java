import java.util.*;
class leapyear{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year:");
        String date=s.nextLine();
        int year=Integer.parseInt(date.split("/")[2]);
        boolean isleap=(year%4==0 && year%100!=0)||(year%400==0);
        if(isleap){
            System.out.println("given year is leap year!");
        }
        else{
            System.out.println("given year is non leap year!");
        }
    }
}
