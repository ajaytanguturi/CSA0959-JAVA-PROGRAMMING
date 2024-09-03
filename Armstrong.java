import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int num,temp,remainder, result=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        num=s.nextInt();
        temp=num;
        while(temp!=0){
            remainder=temp%10;
            result+=(remainder*remainder*remainder);
            temp=temp/10;
        }
        if(num==result){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
    
}
