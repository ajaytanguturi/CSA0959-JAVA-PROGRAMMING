import java.util.*;
public class fizzbuzz {
    public String[] data(int n){
        String[] a=new String[n];
        
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                a[i-1]="FIZZBUZZ";
            }
            else if(i%3==0){
                a[i-1]="FIZZ";
            }
            else if(i%5==0){
                a[i-1]="BUZZ";
            }
            else{
                a[i-1]=String.valueOf(i);
            }
        }
        return a;
    }
    public static void main(String args[]){
        int val;
        Scanner s=new Scanner(System.in);
        System.out.println("enter  range:");
        val=s.nextInt();
        fizzbuzz f=new fizzbuzz();
        String[] result=f.data(val);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        s.close();

    }
}
