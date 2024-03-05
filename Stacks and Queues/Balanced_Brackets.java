// Balanced Brackets
// 1. You are given a string exp representing an expression.
// 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static boolean handelClosing(Stack<Character> stk, char corospondingChar){
        if(stk.size() == 0){
            return false;
        }else if(stk.peek() != corospondingChar){ 
            return false;
        }else{
            stk.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else if(ch == ')'){
                boolean val = handelClosing(stk, '(');
                if(val == false){
                    System.out.println(false);
                    return;
                }
            }else if(ch == '}'){
                boolean val = handelClosing(stk, '{');
                if(val == false){
                    System.out.println(false);
                    return;
                }
            }else if(ch == ']'){
                boolean val = handelClosing(stk, '[');
                if(val == false){
                    System.out.println(false);
                    return;
                }
            }
        }
        if(stk.size() == 0){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
