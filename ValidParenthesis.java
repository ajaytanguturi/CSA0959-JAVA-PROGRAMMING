import java.util.Scanner;
public class ValidParenthesis {
    public static boolean isValidParenthesis(String S) {
        int balance = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine(); 
        for (int i = 0; i < T; i++) {
            String Sc = s.nextLine();
            if (isValidParenthesis(Sc)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        s.close();
    }
}
