public class PostFixNotation {
    public static int evaluatePostfix(String exp) {
        // Create an array to store operands
        int[] operands = new int[exp.length()];
        int top = -1;

        // Traverse through every character of the expression
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the character is an operand, push it to the array
            if (Character.isDigit(c)) {
                operands[++top] = c - '0'; // Convert char to int and push to the array
            } else {
                // If the character is an operator, pop two elements from the array and apply the operator
                int val1 = operands[top--];
                int val2 = operands[top--];

                switch (c) {
                    case '+':
                        operands[++top] = val2 + val1;
                        break;
                    case '-':
                        operands[++top] = val2 - val1;
                        break;
                    case '*':
                        operands[++top] = val2 * val1;
                        break;
                    case '/':
                        operands[++top] = val2 / val1;
                        break;
                }
            }
        }
        // The result is the only element left in the array
        return operands[top];
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("Postfix evaluation of " + exp + " is: " + evaluatePostfix(exp));
    }
}
