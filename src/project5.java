import java.util.Stack;
import java.util.Collections;

    public class project5 {
        Stack<Integer> stack = new Stack<>();
        public void push(int value) {
            stack.push(value);
        }
        public int pop() {
            return stack.pop();
        }
        public int getMax() {
            return Collections.max(stack);
        }
        public int getMin() {
            return Collections.min(stack);
        }

        public static void main(String[] args) {
            project5 stack = new project5();
            stack.push(10);
            stack.push(5);
            stack.push(20);

            System.out.println("Max: " + stack.getMax()); // Output: Max: 20
            System.out.println("Min: " + stack.getMin()); // Output: Min: 5
        }
    }

