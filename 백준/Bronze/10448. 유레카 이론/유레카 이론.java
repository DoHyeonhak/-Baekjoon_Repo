import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[45];
        for(int i = 1; i < 45; i++) {
            arr[i] = i*(i+1)/2;
        }

        while(N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(eureka(num, arr));
        }
    }

    public static int eureka(int num, int[] arr){
        // 3r개의 삼각수의 합으로 가능한지
        for(int i = 1; i < 45; i++){
            for(int j = 1; j < 45; j++){
                for(int k = 1; k < 45; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    if(temp == num) return 1;
                }
            }
        }
        return 0;
    }
}