import java.util.Stack;
public class Main {
    public static void main(String[]args){
        Stack<Integer>Stack=new Stack<>();
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        System.out.println("Stack  :"+Stack);
        System.out.println("Top Element: " + Stack.peek());
        Stack.pop();
        System.out.println("pop:  "+Stack);
    }
}