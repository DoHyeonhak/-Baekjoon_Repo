import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        // * * * 물체의 최대 중량도 고려해야 한다.
        // N개의 로프라면 1개일 떄부터 N개일 때까지 계산해야 한다.
        // [1] [2] [3] [4] [5] 이렇게 수의 크기에 따라 정렬되어있다고 하자
        // 로프 5인 경우는 [1]*5
        // 4: [2]*4 과 이전 답 비교
        // 3: [3]*3 과 이전 답 비교
        // 이렇게 다 비교하면서 최대인 경우를 구하면 된다.
        // 즉, 로프 갯수에 따른 계산이 가능해진다.
        //
        int ans = 0;
        for(int i = 0; i < N; i++) {
            ans = Math.max(arr[i]*(N-i), ans);
        }
        System.out.println(ans);
    }
}

