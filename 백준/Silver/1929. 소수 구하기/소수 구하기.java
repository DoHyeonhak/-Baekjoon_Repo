import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] primes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        primes = new boolean[to + 1];
        cal_prime(to);

        for(int i = from; i <= to; i++) {
            if(!primes[i]) System.out.println(i);
        }
    }
    // 에라토스테네스의 채
    // 특정 수 N이 소수가 아니라면 N = a * b 이다.
    // 여기서 a와 b 중 하나는 루트 N보다 작거나 같을 것이다
    // to가 16이라면
    // loop from 2 to 4
    //  2
    //      loop 4 to 16 (+2)
    //          4 6 8 10 12 14 16
    //  3
    //      loop 9 to 16 (3)
    //         9 12 15
    //  4
    //      loop 16 to 16 (4)
    //          16
    // 나머지는 소수가 된다
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