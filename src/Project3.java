import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(in.nextInt());
        }
        System.out.println(stack);
        System.out.println(stack.pop() + " ");
    }
}

