import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else if (ch == ')') {
                boolean val = HandelClosing(stk, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = HandelClosing(stk, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = HandelClosing(stk, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            }
        }
        if (stk.peek() == 0) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    public static boolean HandelClosing(Stack<Character> stk, char corrosVal) {
        if (stk.size() == 0) {
            return false;
        } else if (stk.peek() != corrosVal) {
            return false;
        } else {
            stk.pop();
        }
        return true;
    }
}
