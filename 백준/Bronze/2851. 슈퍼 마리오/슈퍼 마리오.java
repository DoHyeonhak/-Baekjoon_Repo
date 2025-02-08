import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int sum = 0;
        int diff = 100;
        for(int i = 1; i <= 10; i++) {
            sum += Integer.parseInt(br.readLine());
            if(Math.abs(100-sum) <= diff){
                diff = Math.abs(100-sum);
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}