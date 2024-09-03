import java.util.Scanner;
public class printingsamevalues {
    public static void main(String[] args) {
        int[] data1=new int[5];
        int[] data2=new int[5];
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter values for 1st array:");
        for(i=0;i<5;i++){
            data1[i]=s.nextInt();
        }
        System.out.println("enter values for 2nd array:");
        for(i=0;i<5;i++){
            data2[i]=s.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(data1[i]==data2[j]){
                    System.out.println(data1[i]+" is common");
                    break;
                }
            }
        }
    }
}
