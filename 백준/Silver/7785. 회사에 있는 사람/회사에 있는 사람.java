import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> names = new HashMap<>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(!names.containsKey(name)) {
                names.put(name, 0);
            }else{
                names.remove(name);
            }
        }
        List<String> keys = new ArrayList<>(names.keySet());
        Collections.sort(keys, Collections.reverseOrder());
        for(String key : keys) {
            System.out.println(key);
        }
    }
}

