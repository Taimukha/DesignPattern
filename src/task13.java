import java.util.Scanner;
import java.util.Stack;
public class task13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = in.nextLine();
        for (char i: str.toCharArray()) {
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}