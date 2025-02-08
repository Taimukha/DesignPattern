import java.util.Scanner;
public class task88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        return arr(n, 0, 1);
    }
    public static int arr(int n,int a,int b){
        if(n==0){
            return a;
        }if(n==1){
            return b;
        }
        return arr(n-1,b,a+b);
    }
}
