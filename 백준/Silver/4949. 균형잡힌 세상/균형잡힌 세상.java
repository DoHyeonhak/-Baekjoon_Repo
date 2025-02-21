import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            if(str.equals(".")) break;
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == '(' || c == '['){
                    stack.push(c);
                }else if(c == ')'){
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }else{
                        stack.push(')');
                    }
                }else if(c == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else{
                        stack.push(']');
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}