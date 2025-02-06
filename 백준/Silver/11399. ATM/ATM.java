import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        int ans = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            ans += arr[i] * (n - i);
        }
        System.out.println(ans);
    }
}