import java.util.*;
import java.io.*;

public class Main {
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int v;
    static int e;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // DFS
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());   // 정점 개수
        e = Integer.parseInt(st.nextToken());   // 간선 개수

        for(int i = 0; i < e; i++){ // 간선 개수만큼 반복
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
            // (a,b),(b,a) 서로 연결
        }
        int cnt = 0;
        for(int i = 1; i <= v; i++){ // 꼭짓점 개수만큼 반복
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void dfs(int idx){
        if(visited[idx]){
            return;
        }else{
            visited[idx] = true;
            for(int i = 1; i <= v; i++){
                if(graph[idx][i] == 1){
                    dfs(i);
                }
            }
        }
    }

}