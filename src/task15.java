import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int arr = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!=0){
                nums[arr] = nums[i];
                arr++;
            }
        }
        for (int i = arr; i < n; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}