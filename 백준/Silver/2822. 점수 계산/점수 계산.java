import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] scores = new Integer[8];
        Integer[] temp = new Integer[8];
        int[] idx = new int[5];
        int ans = 0;
        int cnt = 0;
        for(int i = 0; i < 8; i++) {
            scores[i] = sc.nextInt();
            temp[i] = scores[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());
        for(int i = 0; i < 5; i++) {
            ans += temp[i];
            for(int j = 0; j < 8; j++) {
                if(temp[i] == scores[j]) {
                    idx[cnt++] = j + 1;
                    break;
                }
            }
        }
        Arrays.sort(idx);
        System.out.println(ans);
        for (int i = 0; i < 5; i++) {
            System.out.print(idx[i] + " ");
        }
    }
}