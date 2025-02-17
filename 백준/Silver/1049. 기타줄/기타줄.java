import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 기타줄
        int M = Integer.parseInt(st.nextToken());   // 브랜드
        // 6개 패키지 or 낱개
        int pack = Integer.MAX_VALUE;
        int each = Integer.MAX_VALUE;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            pack = Math.min(pack, Integer.parseInt(st.nextToken()));
            each = Math.min(each, Integer.parseInt(st.nextToken()));
        }
        int ans = 0;
        while(N>=6){
            ans += Math.min(pack, each*6);
            N -= 6;
        }
        ans += Math.min(pack, each*N);
        System.out.println(ans);
    }
}

