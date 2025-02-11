import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 시간초과 해결해야 한다.
        // 예를 들어 contains와 같은 함수를 사용하는 것도 좋지만, binary search를 사용하는 것도 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            System.out.print(binarySearch(arr, num) + " ");
        }
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(key > arr[mid]) {    // mid보다 클 때
                low = mid + 1;
            }else if(key < arr[mid]) {  // mid보다 작을 때
                high = mid - 1;
            }else{
                return 1;
            }
        }
        return 0;
    }
}