import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int line = 1;
        while(N-line > 0) {
            N -= line++;
        }
        if(line%2 != 0){  // 홀수
            System.out.println((line+1-N) + "/" + (N));
        }else{  // 짝수
            System.out.println((N) + "/" + (line+1-N));
        }
    }
}