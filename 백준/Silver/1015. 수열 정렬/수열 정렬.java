import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B[P[i]] = A[i]
        // B[P[0]] = A[0] = 2
        // B[P[1]] = A[1] = 3
        // B[P[2]] = A[2] = 1
        // 비내림차순이 되는 수열
        // B[P[2]] = 1 = B[0]
        // B[P[0]] = 2 = B[1]
        // B[P[1]] = 3 = B[2]
        // P는 1, 2, 0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i];
        }
        Arrays.sort(B);
        // 2 3 1
        // 1 2 3
        // 1 2 0
        String ans = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(A[i] == B[j]) {
                    ans += j + " ";
                    B[j] = -1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}