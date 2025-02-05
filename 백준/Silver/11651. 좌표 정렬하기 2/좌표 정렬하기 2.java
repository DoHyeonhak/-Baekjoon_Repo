import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // (x,y) 나열 및 분류
        // Comparator의 비교 방식은 양수 음수 파악으로 진행
        Arrays.sort(arr, (arr1, arr2) -> {
            if(arr1[1] == arr2[1]) {
                return arr1[0] - arr2[0];
            }else{
                return arr1[1] - arr2[1];
            }
        });
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}