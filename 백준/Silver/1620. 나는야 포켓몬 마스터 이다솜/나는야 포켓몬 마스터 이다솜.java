import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 듣
        int M = Integer.parseInt(st.nextToken());   // 보
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[N+1];
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            arr[i] = s;
            map.put(s, i+1);
        }
        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            if(map.containsKey(s)) {
                System.out.println(map.get(s));
            }else{
                System.out.println(arr[Integer.parseInt(s)-1]);
            }
        }
    }
}

