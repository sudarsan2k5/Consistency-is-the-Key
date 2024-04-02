import java.util.Scanner;
import java.util.Stack;


public class gp {
    public static boolean Duplicate(String str){
        // String strn = str;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(stk.peek() == '('){
                    return true;
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
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(Duplicate(str));
    }
}
