import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N + 1];
        int cnt = 0;
        for (int i = 2; i <= N; i++) {
            // 여기서 i는 P
            // 2, 3, , , 이렇게 올라간다
            for(int j = i; j <= N; j+=i) {  //j+=i로 배수 설정
                if(!arr[j]){
                    cnt++;
                    arr[j] = true;
                }
                if(cnt==K){
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}