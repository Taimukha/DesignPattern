import java.util.Scanner;
public class aiiia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=recuse(n);
        System.out.println(sum);
    }
    public static int recuse(int n){

        if (n==0){
            return 0;
        }
        return n%10+recuse(n/10);
    }
}
