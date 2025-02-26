import java.util.*;
import java.io.*;

public class Main {
    // DFS 사용 (graph)
    // declare variables
    static boolean[] visited;
    static int[][] arr;
    static int N, M;
    static int cnt= 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read num
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        arr = new int[N+1][N+1];

        // loop from 0 to M
        //  read numbers
        //  assign numbers
        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }
        // call function
        dfs(1);
        // display the result
        System.out.println(cnt-1);
    }

    public static void dfs(int position){
        visited[position] = true;
        cnt++;
        for(int i = 1; i <= N; i ++){
            if(arr[position][i]==1&&!visited[i]){
                dfs(i);
            }
        }
    }

}