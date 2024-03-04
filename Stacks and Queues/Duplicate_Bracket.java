// 1. You are given a string exp representing an expression.
// 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
// 3. But, some of the pair of brackets maybe extra/needless. 
// 4. You are required to print true if you detect extra brackets and false otherwise.

// ex:-
// ((a + b) + (c + d)) -> false
// (a + b) + ((c + d)) -> true
import java.util.Scanner;
import java.util.Stack;
public class Duplicate_Bracket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //(
            if(ch == ')'){
                if(stk.peek() == '('){
                    System.out.print("true");
                    return;
                }else{
                    while(stk.peek() != '('){
                        stk.pop();
                    }
                    stk.pop();
                }
            }else{
                stk.push(ch);
            }
        }
        System.out.print("false");

    }
}