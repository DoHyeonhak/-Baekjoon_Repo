import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            int cnt = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;
            String univ = "";
            for(int i = 0; i < cnt; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if(max < num){
                    max = num;
                    univ = name;
                }
            }
            System.out.println(univ);
        }
    }
}