import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 이항계수
        // n!/(n-k)!k!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a = factorial(N);
        int b = factorial(K);
        int c = factorial(N-K);
        System.out.println(a/(b*c));

    }
    public static int factorial(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            number *= i;
        }
        return number;
    }
}