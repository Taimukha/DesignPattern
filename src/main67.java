import java.util.Scanner;

public class main67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumNumbers(n));
    }
    public static int sumNumbers(int n){
        if(n==0){
            return 0;
        }
       System.out.print(n+" ");
        return sumNumbers(n-1);
    }
}
