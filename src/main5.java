import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("positive " + positiveCount);
        System.out.println("negative " + negativeCount);
    }
}