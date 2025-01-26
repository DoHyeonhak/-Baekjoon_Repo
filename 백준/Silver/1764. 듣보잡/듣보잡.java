import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        for (int i = 0; i < M; i++) {
            String temp = sc.next();
            if(set.contains(temp)) {
                ans.add(temp);
            }
        }
        Collections.sort(ans);

        System.out.println(ans.size());
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}