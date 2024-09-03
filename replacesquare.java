import java.util.*;
public class replacesquare {
    public static void main(String[] args) {
        int size,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array:");
        size=s.nextInt();
        int[] data1=new int[size];
        System.out.println("enter eleents in array1");
        for(i=0;i<size;i++){
            data1[i]=s.nextInt();

        }
        int[] data2=new int[2*size];
        for (i = 0; i < size; i++) {
            data2[2 * i] = data1[i];
            data2[2 * i + 1] = data1[i] * data1[i];
        }
        System.out.println("the squared array is");
        for(i=0;i<2*size;i++){
            System.out.println(data2[i]);
        }
    }
    
}
