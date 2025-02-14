import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]) {
                max = arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
        cnt = 0;
        max = Integer.MIN_VALUE;
        for(int i = N-1; i >= 0; i--) {
            if(max<arr[i]) {
                max = arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}