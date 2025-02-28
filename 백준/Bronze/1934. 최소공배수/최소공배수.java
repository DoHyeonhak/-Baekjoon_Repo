import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a*b/gcd(a,b));   // 최소공배수
        }
    }
    // 최대공약수
    static int gcd(int a, int b) {
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}