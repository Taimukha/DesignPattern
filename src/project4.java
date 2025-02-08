import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            queue.add(in.nextInt());
        }

        System.out.println(queue);
        System.out.println(queue.peek() + " ");
        System.out.println(queue.poll() + " ");
    }
}