import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        for(int i = 0; i < N; i++) {
            stack = new Stack<>();
            String s = br.readLine();
            String ans = "";
            boolean valid = true;   // break된 경우 확인용(false인 경우 NO를 위함)
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                }else if(stack.isEmpty()){  // ')'이면 pop해야 되는데 empty이면 break
                    ans = "NO";
                    valid = false;
                    break;
                }else{  // ')'
                    stack.pop();
                }
            }

            if(stack.isEmpty()&&valid){    // 괄호가 정상적으로 닫힌 경우
                ans = "YES";
            }else{
                ans = "NO";
            }
            System.out.println(ans);
        }



    }
}