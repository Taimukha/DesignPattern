import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        String str = in.nextLine();
        String[] arr = str.split(",");
        for(String add: arr){
            queue.add(add.trim());
        }
        while (!queue.isEmpty()){
            String served = queue.poll();
            System.out.println("Served "+served);
        }
    }
}