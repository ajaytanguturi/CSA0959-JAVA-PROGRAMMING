import java.util.*;
public class sumandavg {
    public static void main(String[] args) {
        int i,size;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size:");
        size=s.nextInt();
        int[] data= new int[size];
        for(i=0;i<size;i++){
            System.out.println("enter data "+(i+1));
         data[i]=s.nextInt();
        }
        int ps=0,pc=0,pa=0,nc=0,ns=0,na=0;
        for(i=0;i<size;i++){
        if(data[i]<0){
            ns= ns+data[i];
            nc++;
        }
        else{
            ps=ps+data[i];
            pc++;
        }
    }
        pa=ps/pc;
        na=ns/nc;
        System.out.println("positive average of num is :"+pa);
        System.out.println("negative sum and av is :"+na);
    }
}
