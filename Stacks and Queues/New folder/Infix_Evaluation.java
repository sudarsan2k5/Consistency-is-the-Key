import java.util.Scanner;

public class Infix_Evaluation {
    public static int operation(int v1, int v2, cahr optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

    public static int precidence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Integer> oprends = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == '(') {
                oprends.push(ch);
            } else if (chr == Character.isDigit(chr)) {
                oprends.push(chr - '0');
            } else if (chr == '+' || chr == '-' || chr == '*' || chr == '/') {
                while (optors.size() > 0 && optors.peek() != '('
                        && precidence(ch) <= precidence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = oprends.pop();
                    int v1 = oprends.pop();

                    char opv = operation(v1, v2, optor);
                    oprends.push(opv);
                }
                optors.push(ch);
            } else if (chr == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = oprends.pop();
                    int v1 = oprends.pop();

                    char opv = operation(v1, v2, optor);
                    oprends.push(opv);
                }
                optors.pop();
            }
            while (optors.size() != 0) {
                char optor = optors.pop();
                int v2 = oprends.pop();
                int v1 = oprends.pop();

                char opv = operation(v1, v2, optor);
                oprends.push(opv);
            }
            System.out.print(oprends.peek());
        }
    }
}
