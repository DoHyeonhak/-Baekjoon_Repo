import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 한수
        // 1~99는 다 한수
        // 100부터는 확인해봐야 한다
        int N = Integer.parseInt(st.nextToken());
        int ans = 99;
        if(N<100){
            System.out.println(N);
        }else{  // 100 이상인 경우
            for(int i = 100; i <= N; i++){
                int a = i/100;
                int b = (i/10)%10;
                int c = i%10;
                if((a-b)==(b-c)){   // 등차수열이라면
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

}