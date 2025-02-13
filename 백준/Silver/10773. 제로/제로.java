import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                ans -= stack.pop();
            }else{
                stack.push(num);
                ans += num;
            }
        }
        System.out.println(ans);
    }
}