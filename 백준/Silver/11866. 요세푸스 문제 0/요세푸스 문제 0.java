import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) {
            q.add(i);
        }
        int cnt = 1;
        while(!q.isEmpty()) {
            if(cnt == K){
                if(q.size()==1){
                    sb.append(q.poll());
                }else{
                    sb.append(q.poll() + ", ");
                }
                cnt = 1;
                continue;
            }
            q.add(q.poll());
            cnt++;
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}