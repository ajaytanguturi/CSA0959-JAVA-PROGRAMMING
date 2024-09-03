import java.util.*;
class taxcalculation{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter salary:");
        n=s.nextInt();
        if(n<=0){
            System.out.println("Enter valid salary!");
        }
        else{
        if(n<=150000){
            System.out.println(" no tax applicable");
        }
        else if(n>=150001 && n<300000){
            System.out.println("Tax is: "+n*0.10);
        }
        else if(n>=300001 && n<500000){
            System.out.println("Tax is: "+n*0.20);
        }
        else if(n>=500001){
            System.out.println("Tax is : "+n*0.30);
    }
        }
}
}
