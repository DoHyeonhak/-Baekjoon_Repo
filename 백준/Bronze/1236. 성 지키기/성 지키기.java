import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][M];
        int row = 0;
        int col = 0;
        for (int i = 0; i < N; i++) {
            boolean flag = false;
            arr[i] = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 'X') {
                    flag = true;
                    break;
                }
            }
            if(!flag) row++;
        }
        for(int i = 0; i < M; i++){
            boolean flag = false;
            for(int j = 0; j < N; j++){
                if(arr[j][i] == 'X'){
                    flag = true;
                    break;
                }
            }
            if(!flag) col++;
        }
        System.out.println(Math.max(row, col));
    }
}