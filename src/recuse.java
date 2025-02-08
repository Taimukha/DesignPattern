
import java.util.Scanner;

public class recuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Нәтиже: " + power(n, m));
    }
    public static int power(int n, int m) {
        if (m == 0) {
            return 1;
        } else {
            return n * power(n, m - 1);
        }
    }
}
