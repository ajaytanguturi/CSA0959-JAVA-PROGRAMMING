import java.time.*;
import java.util.*;
public class dayofweek {
    public static void main(String[] args) {
    int day,month,year;
    Scanner s=new Scanner(System.in);
    System.out.println("enter day:");
    day=s.nextInt();
    System.out.println("enter month:");
    month=s.nextInt();
    System.out.println("enter year:");
    year=s.nextInt();
    LocalDate date=LocalDate.of(year,month,day);
    DayOfWeek dayOfWeek=date.getDayOfWeek();
    String dayOfWeekString=dayOfWeek.toString().substring(0,1)+dayOfWeek.toString().substring(1).toLowerCase();
    System.out.println("the day is :"+dayOfWeekString);
    }
    
}
