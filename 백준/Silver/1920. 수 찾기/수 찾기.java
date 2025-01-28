import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 이중 반복문만 사용한다고 하면 시간 초과 문제가 계속 생김
        // 시간복잡도가 맞은 이진탐색법 사용
        Scanner sc = new Scanner(System.in);
        int i, j;
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
            if(Arrays.binarySearch(arr1, arr2[i]) >= 0) { // binary search
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}