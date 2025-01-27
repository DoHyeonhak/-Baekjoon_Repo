import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int cnt = 1;
        while(true) {
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            if(L == 0 && P == 0 && V == 0) break;
            if(V%P > L){
                ans = (V/P*L) + L;
            }else{
                ans = (V/P*L) + (V%P);
            }
            System.out.println("Case " + (cnt++) + ": " + ans);
        }
    }
}