import java.util.Scanner;
public class task111{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
