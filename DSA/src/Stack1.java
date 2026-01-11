import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push("Foot Ball");
        stack.push("Volley Ball");
        stack.push("kabbadi");
        stack.push("Cricket");

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        String removed = stack.pop();
        System.out.println("The removed item : "+ removed);
    }
}
