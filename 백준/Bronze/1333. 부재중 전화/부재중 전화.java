import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        ArrayList<Boolean> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            // 노래 출력
            for(int j = 0; j < L; j++) {
                list.add(true);
            }
            // 마지막 아닌 경우 대기시간
            if(i!=N-1){
                for(int j = 0; j < 5; j++) {
                    list.add(false);
                }
            }
        }
        int ans = 0;
        for(ans = 0; ans < list.size(); ans+=D) {
            if(!list.get(ans)) {
                break;
            }
        }
        System.out.println(ans);
    }
}