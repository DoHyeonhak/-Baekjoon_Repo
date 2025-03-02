import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3의 배수이면서 5의 배수 FizzBuzz
        // 3의 배수이지만 5의 배수가 아니면 Fizz
        // 3의 배수는 아니지만 5의 배수이면 Buzz
        // 3도 5도 아니면 i 그대로 출력
        String[] numbers = new String[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = br.readLine();
        }
        int cnt = 0;
        int idx = 0;
        for(int i = 2; i >= 0; i--) {
            if(!numbers[i].equals("Fizz")
            &&!numbers[i].equals("Buzz")
            &&!numbers[i].equals("FizzBuzz")) {
                idx = i;
                break;
            }else{
                cnt++;
            }
        }
        int ans = Integer.parseInt(numbers[idx])+cnt+1;
        StringBuilder sb = new StringBuilder();
        if(ans%3==0&&ans%5==0) {
            sb.append("FizzBuzz");
        }else if(ans%3!=0&&ans%5==0) {
            sb.append("Buzz");
        }else if(ans%3==0&&ans%5!=0) {
            sb.append("Fizz");
        }else{
            sb.append(ans);
        }
        System.out.println(sb.toString());
    }
}