import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++) {
            q.add(i);
        }
        StringBuilder sb = new StringBuilder();
        // Queue: 선입선출
        // 1, 2, 3, 4, 5, 6, 7 에서 3을 빼려면
        // 1, 2는 빠졌다가 다시 들어가는게 베스트 (원으로 돌아가기 때문)
        sb.append("<");
        int idx = 1;
        while(!q.isEmpty()) {
            // 찾은 경우
            if(idx == M){
                if(q.size() == 1){
                    sb.append(q.remove());
                }else{
                    sb.append(q.remove() + ", ");
                }
                idx = 1;
                continue;
            }
            // 찾지 못한 경우
            q.add(q.remove());
            idx++;
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}