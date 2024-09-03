import java.util.*;
class prime extends Thread{
    private int value;
    prime(int v){
    this.value=v;
    }
    public void run(){
        int i=2,f=0;
        while(i<value){
            if(value%i==0){
                f=1;
                break;
            }
            i++;
        }
        if(f==0){
            System.out.println(value+" is prime number!");
        }
        else{
            System.out.println("composite number!");
        }
    }

}
public class primethread {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int n=s.nextInt();
        prime t=new prime(n);
        t.start();
    }
    
}
