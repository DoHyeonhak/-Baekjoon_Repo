import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean[][] arr = new boolean[100][100];
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    if(!arr[j][k]) {    // 1이 아니라면
                        arr[j][k] = true;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}