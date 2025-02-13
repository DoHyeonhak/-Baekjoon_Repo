import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // fib 0, 1, . . . 계속 나열하면 규칙성이 보임
        // 점화식 접근
        int[] dp0 = new int[41];
        int[] dp1 = new int[41];
        dp0[0] = dp1[1] = 1;
        dp0[1] = dp1[0] = 0;
        // fib0 - 0:1, 1:0
        // fib1 - 0:0, 1:1
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            for(int j = 2; j <= num; j++) {
                dp0[j] = dp0[j-1] + dp0[j-2];
                dp1[j] = dp1[j-1] + dp1[j-2];
            }
            System.out.println(dp0[num] + " " + dp1[num]);
        }
    }
}