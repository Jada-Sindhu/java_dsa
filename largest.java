import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();      
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
