import java.util.*;
class fibo extends Thread{
    private int value;
    fibo (int v){
    this.value=v;
    }
    public void run(){
        int fn=0,sn=1;
        for(int i=0;i<value;i++){
             
            System.out.print("Thread: "+threadId()+" "+fn);
            int nn= fn+sn;
            fn=sn;
            sn=nn;
        }
    }
}
 class multiplethreads {
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        n=s.nextInt();
        for(int i=0;i<3;i++){
        fibo t=new fibo(n);
        t.start();
        }
    }
}
