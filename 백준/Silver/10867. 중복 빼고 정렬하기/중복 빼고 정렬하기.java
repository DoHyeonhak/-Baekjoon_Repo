import java.util.*;
import java.io.*;

public class Main {
    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(!set.contains(a)) {
                set.add(a);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}