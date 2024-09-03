public class primehd {
    static int flag; 
    public static void main(String[] args) {
        int n = 4; 
        int num = 2; 
        for (int i = 1; i <= n; i++) {
            int count = 0;
            while (count < i) {
                checkp(num);
                if (flag == 1) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            int count = 0;
            while (count < i) {
                checkp(num);
                if (flag == 1) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }
    public static void checkp(int num) {
        flag = 1;
        if (num <= 1) {
            flag = 0;
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = 0;
                return;
            }
        }
    }
}
