import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 최소 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            // 0이 주어진 횟수만큼 답을 출력한다.
            // 비어있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0 출력
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(pq.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(num);
            }
        }


    }
}