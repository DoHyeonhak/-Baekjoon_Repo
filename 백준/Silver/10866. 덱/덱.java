import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_back")){
                int num = Integer.parseInt(st.nextToken());
                deq.addLast(num);
            }else if(s.equals("push_front")){
                int num = Integer.parseInt(st.nextToken());
                deq.addFirst(num);
            }else if(s.equals("back")){
                if(deq.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deq.peekLast());
                }
            }else if(s.equals("front")){
                if(deq.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deq.peekFirst());
                }
            }else if(s.equals("pop_back")){
                if(deq.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deq.pollLast());
                }
            }else if(s.equals("pop_front")){
                if(deq.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deq.pollFirst());
                }
            }else if(s.equals("size")){
                System.out.println(deq.size());
            }else if(s.equals("empty")){
                if(deq.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }
    }
}


