import java.util.Scanner;
import java.util.Stack;

/**
 * 1.Duplicate_brackets
 */
public class Duplicate_brackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stk.peek() == '(') {
                    System.out.print(true);
                    return;
                } else {
                    while (stk.peek() != '(') {
                        stk.pop();
                    }
                    stk.pop();
                }
            } else {
                stk.push(ch);
            }
        }
        System.out.println(false);
    }
}