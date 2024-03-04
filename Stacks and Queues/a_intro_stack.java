import java.util.Stack;
public class a_intro_stack {
    public static void main(String[] args) {
        //Declaration Stack
        Stack<Integer> stk = new Stack<>();
        // add == push()
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        System.out.println(stk);
        // Remove == pop()
        stk.pop();
        stk.pop();
        System.out.println(stk);
        // stk.peek();
        //first element == peek()
        System.out.println(stk.peek());
        // size of stk == stk.size();
        System.out.print(stk.size());
    }    
}