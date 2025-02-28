import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
//        2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//        3: 스택에 들어있는 정수의 개수를 출력한다.
//        4: 스택이 비어있으면 1, 아니면 0을 출력한다.
//        5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmdNum = Integer.parseInt(st.nextToken());
            if(cmdNum == 1) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(cmdNum == 2) {
                if(!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(cmdNum == 3) {
                sb.append(stack.size()).append("\n");
            }else if(cmdNum == 4) {
                if(stack.isEmpty()) {
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(cmdNum == 5) {
                if(!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}