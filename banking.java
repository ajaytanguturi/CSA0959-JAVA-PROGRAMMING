import java.util.*;
class bankaccount{
    int num,bal=1000;
    String dname;
    String type;
    Scanner s=new Scanner(System.in);
    void read(){
        System.out.println("enter acc no:");
        this.num=s.nextInt();
        s.nextLine();
        System.out.println("enter name of depositor:");
        this.dname=s.nextLine();
        System.out.println("enter type of account:");
        this.type=s.nextLine();
    }
    void deposit(){
        System.out.println("enter amount:");
        int amt=s.nextInt();
        if(amt>0){
            bal=bal+amt;
            System.out.println("balance is :"+bal);
        }
        else{
            System.out.println("Deposit failed!");
        }
    }
    void withdraw(){
        System.out.println("enter amount to withdraw:");
        int amt=s.nextInt();
        if(500>bal-amt){
            System.out.println("Min bal is 500");
        }
        else{
            bal=bal-amt;
            System.out.println("balance is :"+bal);
        }
    }
}
public class banking {
    public static void main(String[] args) {
        bankaccount b=new bankaccount();
        b.read();
        b.deposit();
        b.withdraw();
    }
}
