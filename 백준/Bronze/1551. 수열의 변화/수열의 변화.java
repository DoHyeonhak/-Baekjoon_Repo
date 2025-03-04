import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        String str = br.readLine();
        if(K==0){
            System.out.println(str);
            return;
        }

        String[] strArr = str.split(",");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int i = 0;
        int size = 0;
        int[] temp;
        while(K-->0){
            temp = new int[N-i-1];
            size = temp.length;
            for(int j = 0; j < size; j++){
                temp[j] = arr[j+1]-arr[j];
            }
            arr = temp;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < size; j++){
            if(j == size-1){
                sb.append(arr[j]);
            }else{
                sb.append(arr[j]).append(",");
            }
        }
        System.out.println(sb.toString());
    }
}