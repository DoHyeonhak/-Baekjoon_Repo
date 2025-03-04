import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer arr1[] = new Integer[N];
        Integer arr2[] = new Integer[N];
        int ans = 0;
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = 0; i < N; i++) {
            ans += arr1[i]*arr2[i];
        }
        System.out.println(ans);

    }

}