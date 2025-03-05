import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        while(!flag) {
            flag = true;
            for(int i = 0; i < 4; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    for(int j = 0; j < 5; j++)
                        sb.append(arr[j] + " ");
                    sb.append("\n");

                    flag = false;
                }
            }
        }
        System.out.println(sb.toString());
    }
}