import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class Project2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         LinkedList<Integer> list = new LinkedList<>();
          int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max + " ");
    }
}