import java.util.*;
import java.io.*;

public class Main {
    static boolean[] primes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                q.offer(Integer.parseInt(st.nextToken()));
            }else if(s.equals("pop")){
                if(!q.isEmpty()){
                    sb.append(q.poll()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(s.equals("size")){
                sb.append(q.size()).append("\n");
            }else if(s.equals("empty")){
                if(q.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(s.equals("front")){
                if(!q.isEmpty()){
                    sb.append(q.peek()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(s.equals("back")){
                if(!q.isEmpty()){
                    sb.append(q.peekLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}