import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 1: 1
        // 2: 2
        // 3: 4
        // 4: 7
        // 5: 13
        // dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            for(int j = 4; j <= a; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[a]);
        }
    }
}