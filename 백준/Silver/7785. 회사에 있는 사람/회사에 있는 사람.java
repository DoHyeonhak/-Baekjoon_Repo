import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if(map.containsKey(input[0])) {
                map.remove(input[0]);
            }else{
                map.put(input[0], input[1]);
            }
        }
        List<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for(String s : list) {
            System.out.println(s);
        }
    }
}