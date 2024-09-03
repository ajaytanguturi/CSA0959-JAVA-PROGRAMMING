import java.util.*;
class bonus{
    int salary;
    double bonus,totalsal;
    Scanner s=new Scanner(System.in);
    void A(){
        System.out.println("enter salary:");
        this.salary=s.nextInt();
        if(salary>10000){
        bonus=(0.05*salary);
        }
        else{
            bonus=(0.05*salary)+(0.02*salary);
        }
        totalsal=salary+bonus;
        System.out.println("total to be paid is :"+totalsal);
    }
    void B(){
        System.out.println("enter salary:");
        this.salary=s.nextInt();
        if(salary>10000){
        bonus=(0.10*salary);
        }
        else{
            bonus=(0.10*salary)+(0.02*salary);
        }
        totalsal=salary+bonus;
        System.out.println("total to be paid :"+totalsal);
    }
}
public class Newyearbonus{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter grade of employee(A/B) :");
        char c=s.next().charAt(0);
        bonus e=new bonus();
        if(c=='A'){
            e.A();
        }
        else{
            e.B();
        }
        
    }
}

