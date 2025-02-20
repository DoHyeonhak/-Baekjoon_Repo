import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int N, M;
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int ans = 0;

            Queue<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                // 순서, 중요도
                q.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            // 중요도에 따라 정렬 및 카운팅
            // 무한반복문
            //  처음 q값
            //  체크용 불리안 변수
            //  중요도끼리 비교하는 반복문 요구됨
            //      arr보다 중요도가 큰 값이 있는지 확인해야 된다.
            //      있으면 arr을 q뒤로 다시 입력해야된다.
            //  없으면 문제 상으로 출력되는 것이므로 ans++로 카운팅
            while(true){
                int[] arr = q.poll();   // front 값
                boolean check = true;
                for(int[] c: q){
                    if(c[1]>arr[1]){    // 중요도가 높은 것이 있다면
                        check = false;
                        break;
                    }
                }
                if(check){
                    ans++;
                    if(arr[0]==M) break;
                }else{
                    q.add(arr);
                }
            }
            System.out.println(ans);
        }
    }
}