import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> names = new HashMap<>();
        String[] arr = new String[N+1];
        String line;

        for (int i = 0; i < N; i++) {
            line = br.readLine();
            arr[i] = line;
            names.put(arr[i], i+1);
        }

        for(int i = 0; i < M; i++) {
            line = br.readLine();
            // ASCII CODE 적용
            if(line.charAt(0) > 47 && line.charAt(0) < 58) {    // 숫자인 경우
                System.out.println(arr[Integer.parseInt(line)-1]);
            }else{  // 문자인 경우
                System.out.println(names.get(line));
            }
        }
    }
}