import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 30의 배수. . . 3의 배수는 각 자리 다 더하면 3의 배수가 된다.
        // 30이면 일단 끝자리는 0이다
        // 1. 0이 있는지 없는지 확인
        // 2. 각 자리의 합이 3의 배수인지 확인

        String str = br.readLine();
        int[] arr = new int[str.length()];
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
            sum += arr[i];
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        if(sum%3==0&&arr[0]==0){
            for(int i = str.length()-1; i >= 0; i--){
                sb.append(arr[i]);
            }
        }else{
            sb.append(-1);
        }
        System.out.println(sb.toString());

    }
}