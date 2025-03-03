import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 오르막길의 크기
        int top = 0;
        int bottom = 0;
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        top = bottom = arr[0];
        for(int i = 1; i < N; i++) {
            if(arr[i] > arr[i-1]) {
                top = arr[i];
            }else if(arr[i] <= arr[i-1]) {
                result = Math.max(result, top-bottom);
                top = bottom = arr[i];
            }
            // System.out.println("i: "+ i +", top: "+top+", bottom: "+bottom+", result: "+result);
        }
        result = Math.max(result, top - bottom);
        System.out.println(result);
    }
}