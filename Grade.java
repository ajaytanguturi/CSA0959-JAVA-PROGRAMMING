
import java.util.*;
class Grade{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks in python:");
        int m1=s.nextInt();
        System.out.println("Enter the marks in c programming:");
        int m2=s.nextInt();
        System.out.println("Enter the marks in Mathematics:");
        int m3=s.nextInt();
        System.out.println("Enter the marks in Physics: ");
        int m4=s.nextInt();
        int total=(m1+m2+m3+m4);
        double avg=total/4;
        if(avg>=75){
            System.out.println("Distinction");
        }
        else if(avg>=60 && avg<75){
            System.out.println("First Divison");
        }
        else if(avg>=50 && avg<60){
            System.out.println("second division");
        }
        else if(avg>=40 && avg<50){
            System.out.println("Third division");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}
