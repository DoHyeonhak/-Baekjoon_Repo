import java.util.*;
import java.io.*;

public class Main {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // dp 사용하기
        // 최소 연산으로 1을 만드는 문제이므로, dp[0]=dp[1]=0;
        // 각 숫자마다 연산방법의 개수가 다른 문제가 있으며
        // 최소 연산을 찾아야 함으로
        // 재귀호출을 통한 연산을 활용하는 것이 적합 (top-down)
        // (bottom-up)이 더 나을 것 같기도 함
        // 또한 연산을 시행하는 과정이기 때문에 시행횟수 고려도 중요
        dp = new Integer[N+1];
        dp[0] = dp[1] = 0;
//        System.out.println(recursion(N)); // top-down
        for(int i = 2; i <= N; i++) {
            // 1을 빼는 경우
            // 2로 나누어 떨어지는 경우
            // 3으로 나누어 떨어지는 경우
            dp[i] = dp[i-1] + 1;    // 1을 뺀 경우
            if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
            if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
        }
        System.out.println(dp[N]);  // bottom-up
    }
    // Top-down
    static int recursion(int n) {
        if(dp[n] == null){
            if(n%6==0){
                dp[n] = Math.min(recursion(n-1), Math.min(recursion(n/3), recursion(n/2)))+1;
            }else if(n%3==0){
                dp[n] = Math.min(recursion(n-1), recursion(n/3))+1;
            }else if(n%2==0){
                dp[n] = Math.min(recursion(n-1), recursion(n/2))+1;
            }else{
                dp[n] = recursion(n-1)+1;
            }
        }
        return dp[n];
    }
}