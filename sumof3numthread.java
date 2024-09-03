import java.util.*;
class sumofthread extends Thread{
    int num1,num2,num3,sum;
    public void run(){
        Scanner s=new Scanner(System.in);
        System.out.println(threadId()+"enter 1st number:");
        num1=s.nextInt();
        System.out.println(threadId()+"enter 2nd number:");
        num2=s.nextInt();
        System.out.println(threadId()+"enter 3rd number:");
        num3=s.nextInt();
        sum=num1+num2+num3;
        System.out.println("Thread "+threadId()+" : "+sum);
    }
}
public class sumof3numthread {
    public static void main(String args[]){
        for(int i=0;i<3;i++){
            sumofthread t=new sumofthread();
            t.start();
        }
    }   
}
