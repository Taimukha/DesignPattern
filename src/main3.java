import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);


    }
}