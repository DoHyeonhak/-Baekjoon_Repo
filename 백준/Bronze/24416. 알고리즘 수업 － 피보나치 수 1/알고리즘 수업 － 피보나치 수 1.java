import java.util.*;
import java.io.*;

public class Main {
    public static int cnt1 = 0;
    public static int cnt2 = 0;
    public static int[] f = new int[41];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib(n);
        fib2(n);
        System.out.println(cnt1 + " " + cnt2);
    }
    public static int fib(int n){
        if(n==1||n==2){
            cnt1++;
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static int fib2(int n){
        f[0] = f[1] = 1;
        for(int i=2;i<n;i++){
            cnt2++;
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
}