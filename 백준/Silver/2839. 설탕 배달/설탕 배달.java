import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // N 킬로그램 배달 (3, 5단위)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(n > 0){
            if(n%5 == 0){   // 5의 배수
                cnt += n/5;
                break;
            }else{  // 5의 배수가 아닌 경우
                n -= 3;
                cnt ++;
            }
            if(n < 0){
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }

}