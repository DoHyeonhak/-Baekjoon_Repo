import java.util.*;
import java.io.*;

public class Main {
    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append((upperBound(arr, num)-lowerBound(arr, num))).append(" ");
        }
        System.out.println(sb.toString());
    }

    static int lowerBound(Integer[] arr, int key) {
        int left = 0, right = arr.length;
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] >= key) { // key값이 중간보다 작거나 같은 경우
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    static int upperBound(Integer[] arr, int key) {
        int left = 0, right = arr.length;
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] > key) {    // key값이 중간보다 작은 경우
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}