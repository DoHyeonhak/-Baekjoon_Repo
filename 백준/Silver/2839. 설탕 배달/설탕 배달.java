import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        // 3, 5
        // 배달 최소 봉지
        while(N>0){
            // 5로 나누었을 때 나머지가 0이 아니면 3으로 계속 빼기
            if(N%5==0){
                cnt += N/5;
                break;
            }else{
                N-=3;
                cnt++;
            }
            if(N<0){
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}

