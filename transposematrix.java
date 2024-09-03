import java.util.*;
public class transposematrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int m=s.nextInt();
        System.out.println("enter no of col:");
        int n=s.nextInt();
        int[][] a=new int[m][n];
        System.out.println("enter elements of matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }    
}
