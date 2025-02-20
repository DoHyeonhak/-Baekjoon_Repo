import java.util.*;
import java.io.*;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        board = new char[N][M];

        // read
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            board[i] = s.toCharArray();
        }

        // 8x8로 잘라내야되므로
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                min = Math.min(min, count(i,j));
            }
        }
        System.out.println(min);

    }

    public static int count(int x, int y) {
        int cnt1 = 0;   // w시작
        int cnt2 = 0;   // b시작
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j ++){
                // i+j가 홀수면 시작과 반대
                // 짝수면 시작과 동일
                char c = board[x+i][y+j];
                if((i+j)%2!=0) {
                    if(c=='B') cnt2++;         // b 시작인데 b라면 w로 수정
                    if(c=='W') cnt1++;         // w 시작인데 w라면 b로 수정
                }else{
                    if(c=='B') cnt1++;         // w 시작인데 b라면 w로 수정
                    if(c=='W') cnt2++;         // b 시작인데 w라면 b로 수정
                }
            }
        }
        return Math.min(cnt1, cnt2);
    }
}