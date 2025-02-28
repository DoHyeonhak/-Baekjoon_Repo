import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 30배수
        // 끝자리 0
        // 3의 배수는 각 자리를 다 더했을 때에도 3의 배수
        String str = br.readLine();
        int[] arr = new int[str.length()];
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
            sum += arr[i];
        }
        Arrays.sort(arr);
        if(sum%3==0&&arr[0]==0){
            for(int i = arr.length-1; i>=0; i--){
                System.out.print(arr[i]);
            }
        }else{
            System.out.println(-1);
        }
    }
}