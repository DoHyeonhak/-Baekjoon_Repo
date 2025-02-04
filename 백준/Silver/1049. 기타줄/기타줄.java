import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int pack = Integer.MAX_VALUE;
        int one = Integer.MAX_VALUE;
        for(int i = 1; i <= M; i++) {
            pack = Math.min(pack, sc.nextInt());
            one = Math.min(one, sc.nextInt());
        }
        int ans = 0;
        while(N>=6){
            ans += Math.min(one*6, pack);
            N -= 6;
        }
        if(N>0){
            ans += Math.min(one*N, pack);
        }
        System.out.println(ans);
    }

}