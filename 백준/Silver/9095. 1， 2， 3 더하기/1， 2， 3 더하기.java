import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // 1 - 1
        // 2 - 2
        // 3 - 4
        // 4 - 7
        // 5 - 13
        int[] arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            for(int j = 4; j <= num; j++) {
                arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
            }
            System.out.println(arr[num]);
        }
    }
}

