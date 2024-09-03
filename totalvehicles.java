import java.util.*;
public class totalvehicles{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int W = s.nextInt();
        if (V <= 0 || W <= 0 || W % 2 != 0 || V >= W) {
            System.out.println("INVALID INPUT");
            return;
        }
        int FW = (W - 2 * V) / 2;
        int TW = V - FW;
        if (TW < 0 || FW < 0) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("TW = " + TW + " FW = " + FW);
        }
    }
}
