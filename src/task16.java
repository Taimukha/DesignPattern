import java.util.Scanner;


public class task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 0;
        }
        return n -factorial(n -1);
    }
}



