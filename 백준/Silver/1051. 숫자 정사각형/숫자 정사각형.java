import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int ans = 1;
        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                int num = arr[i][j];
                for(int k = 0; k < N; k++) {
                    int temp = arr[k][j];
                    if(i==k) continue;
                    if(temp == num){
                        int dist = Math.abs(i - k);
                        if(j+dist>=0 && j+dist<M){
                            if(temp == arr[k][j+dist]){
                                if(temp == arr[i][j+dist]){
                                    ans = Math.max(ans, (dist+1)*(dist+1));
                                }
                            }
                        }
                        if(j-dist>=0 && j-dist<M){
                            if(temp == arr[k][j-dist]){
                                if(temp == arr[i][j-dist]){
                                    ans = Math.max(ans, (dist+1)*(dist+1));
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}