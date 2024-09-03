import java.util.*;
class college{
public static void main(String args[]){
int total_user,staff_user,nonteacher_user,student_user;
Scanner s=new Scanner(System.in);
System.out.println("enter total users: ");
total_user=s.nextInt();
System.out.println("enter total staff users: ");
staff_user=s.nextInt();
nonteacher_user=staff_user/3;
student_user=total_user-staff_user-nonteacher_user;
System.out.println("total student users in the college is : "+student_user);
}
}
