import java.util.*;
import java.io.*;

public class Main {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        // Binary Search 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if(binarySearch(arr, target) >= 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
    static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(key < arr[mid]) {  // key가 더 작은 경우
                right = mid - 1;
            }else if(key > arr[mid]) {    // key가 더 큰 경우
                left = mid + 1;
            }else{  // 같은 경우
                return mid;
            }
        }
        return -1;
    }

}