import java.util.ArrayList;
import java.util.Scanner;
public class frequencyusingarraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> fr = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            fr.add(0);  
        }
        int visited = -1;10
        for(int i = 0; i < arr.size(); i++) {
            int count = 1;
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i).equals(arr.get(j))) {
                    count++;
                    fr.set(j, visited); 
                }
            }
            if(fr.get(i) != visited) {
                fr.set(i, count);
            }
        }
        for(int i = 0; i < fr.size(); i++) {
            if(fr.get(i) != visited) {
                System.out.println("    " + arr.get(i) + "    |    " + fr.get(i));
            }
        } 
    }
}
