import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}