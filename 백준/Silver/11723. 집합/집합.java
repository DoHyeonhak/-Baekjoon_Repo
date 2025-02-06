import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            if(s.equals("add")){
                arr.add(Integer.parseInt(st.nextToken()));
            }else if(s.equals("check")){
                if(arr.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append("1").append("\n");
                }else{
                    sb.append("0").append("\n");
                }
            }else if(s.equals("remove")){
                int num = Integer.parseInt(st.nextToken());
                if(arr.contains(num)){
                    arr.remove(arr.indexOf(num));
                }
            }else if(s.equals("toggle")){
                int num = Integer.parseInt(st.nextToken());
                if(arr.contains(num)){
                    arr.remove(arr.indexOf(num));
                }else{
                    arr.add(num);
                }
            }else if(s.equals("all")){
                arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
            }else if(s.equals("empty")){
                arr.clear();
            }
        }
        System.out.println(sb.toString());
    }
}