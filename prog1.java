import java.util.Stack;

public class Main {
  public static void main(final String[] args) {
    final Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    
    System.out.println("Stack: " + stack);
    
    System.out.println("Popped element: " + stack.pop());
    
    System.out.println("Stack after pop operation: " + stack);
  }
}