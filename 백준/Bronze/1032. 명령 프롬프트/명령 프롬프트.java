import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String ans = "";
        String temp = "";
        int cnt = 0;
        StringBuilder sb = null;
        while (cnt < N) {
            temp = br.readLine();
            for(int i = 0; i < temp.length(); i++) {
                if(cnt == 0){
                    ans = temp;
                    sb = new StringBuilder(ans);
                    break;
                }
                if(temp.charAt(i) != ans.charAt(i)){
                    sb.setCharAt(i, '?');
                }
            }
            cnt++;
        }
        System.out.println(sb.toString());
    }
}