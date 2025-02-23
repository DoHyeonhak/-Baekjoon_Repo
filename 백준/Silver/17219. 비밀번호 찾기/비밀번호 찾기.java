import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,String> map = new HashMap<>();
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }
        while(M-->0){
            String s = br.readLine();
            System.out.println(map.get(s));
        }

    }
}