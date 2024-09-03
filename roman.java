import java.util.*;
class roman {
    public static void main(String args[]) {
        String str;
        int length, result; 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Roman numeral: "); 
        str = s.nextLine();
        result = 0; 
        length = str.length(); 
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i); 
            char nextch = ' '; 
            if (i + 1 < length)
                nextch = str.charAt(i + 1);
            if (ch == 'M') {
                result += 1000;
            } else if (ch == 'C') {
                if (nextch == 'M') {
                    result += 900;
                    i++;
                } else if (nextch == 'D') {
                    result += 400;
                    i++;
                } else {
                    result += 100;
                }
            } else if (ch == 'D') {
                result += 500;
            } else if (ch == 'X') {
                if (nextch == 'C') {
                    result += 90;
                    i++;
                } else if (nextch == 'L') {
                    result += 40;
                    i++;
                } else {
                    result += 10;
                }
            } else if (ch == 'L') {
                result += 50;
            } else if (ch == 'I') {
                if (nextch == 'X') {
                    result += 9;
                    i++;
                } else if (nextch == 'V') {
                    result += 4;
                    i++;
                } else {
                    result += 1;
                }
            } else if (ch == 'V') {
                result += 5;
            } else {
                System.out.println("Invalid Roman numeral"); 
            }
        }
        System.out.println("Result: " + result);
    }
}
