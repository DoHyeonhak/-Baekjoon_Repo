import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 99;
        if(N>=100){
            for(int i = 100; i <= N; i++){
                int a = i/100;
                int b = (i%100)/10;
                int c = i%10;
                if((b-a)==(c-b)) {
                    ans++;
                }
            }
        }else{
            ans = N;
        }
        System.out.println(ans);
    }
}