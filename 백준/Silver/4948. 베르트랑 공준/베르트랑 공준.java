import java.util.*;
import java.io.*;

public class Main {
    static boolean[] primes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N보다 크고 2*N보다 작은 소수 카운팅
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            primes = new boolean[N*2+1];
            int cnt = 0;
            cal_prime(N*2);
            for(int i = N+1; i <= N*2; i++) {
                if(!primes[i]) cnt++;
            }
            System.out.println(cnt);
        }
    }

    public static void cal_prime(int to) {
        primes[0] = primes[1] = true;   // 소수 아님
        for(int i = 2; i <= Math.sqrt(to); i++) {
            if(primes[i]) continue;
            for(int j = i * i; j <= to; j += i) {
                primes[j] = true;
            }
        }
    }
}