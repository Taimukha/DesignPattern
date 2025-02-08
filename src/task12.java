import java.util.Stack;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <=n; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + "");
        }
    }
}





