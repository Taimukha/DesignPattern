import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Project1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            sum+= array[i];
        }
        System.out.println(sum);
    }
}
