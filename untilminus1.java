import java.util.*;
class untilminus1{
    public static void main(String args[]){
        int[] data=new int[100];
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements:");
        for(int i=0;i<100;i++){
            int a;
            a=s.nextInt();
            if(a==-1){
                break;
            }
            else{
                data[i]=a;
            }
        }
        int ps=0,pc=0,ns=0,nc=0;
        double pa=0,na=0;
        for(int i=0;i<data.length;i++){
            if(data[i]>0){
                ps=ps+data[i];
                pc++;
            }
            else if(data[i]<0){
                ns=ns+data[i];
                nc++;
            }
        }
        pa=ps/pc;
        na=ns/nc;
        System.out.println("Positive average:"+pa);
        System.out.println("Negative avg:"+na);
    }
}
