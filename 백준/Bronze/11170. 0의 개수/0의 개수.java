import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for(int i = N; i <= M; i++) {
                if(i==0) cnt++;
                int temp = i;
                while(temp>0){
                    if(temp%10==0) cnt++;
                    temp/=10;
                }
            }
            System.out.println(cnt);
        }

    }
}