import java.util.Stack;

class Solution {
    public String infixToPrefix(String s) {
        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                operands.push("" + c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    processTop(operands, operators);
                }
                operators.pop(); // pop '('
            } else { // operator
                while (!operators.isEmpty() &&
                        (precedence(c) < precedence(operators.peek()) ||
                         (precedence(c) == precedence(operators.peek()) && c != '^'))) {
                    processTop(operands, operators);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            processTop(operands, operators);
        }

        return operands.peek();
    }

    private void processTop(Stack<String> operands, Stack<Character> operators) {
        char op = operators.pop();
        String op2 = operands.pop();
        String op1 = operands.pop();
        operands.push(op + op1 + op2);
    }

    private int precedence(char op) {
        switch (op) {
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
            default: return -1;
        }
    }
}
