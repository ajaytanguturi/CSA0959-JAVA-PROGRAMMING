import java.util.*;
class untilstar{
    public static void main(String args[]){
        char[] data=new char[100];
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements:");
        for(int i=0;i<100;i++){
            char a;
            a=s.next().charAt(0);
            if(a=='*'){
                break;
            }
            else{
                data[i]=a;
            }
        }
        int lc=0,uc=0,d=0;
        for(int i=0;i<data.length;i++){
            if(data[i]>='A'&& data[i]<'Z'){
                uc++;
            }
            else if(data[i]>='a'&& data[i]<'z'){
                lc++;
            }
            else if(data[i]>='0' && data[i]<'9'){
                d++;
            }
        }
        System.out.println("the lower case letters are:"+lc);
        System.out.println("the upper case letters are: "+uc);
        System.out.println("the numbers are:"+d);
    }
}
