import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 1. 네 변의 길이가 같은 경우
        // 2. 대각선 길이 확인
        // xy값들 다 입력받기
        int[][] arr;
        for(int i = 0; i < n; i ++){
            arr = new int[4][2];
            for(int j = 0; j < 4; j ++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }
            double[] dist = new double[6];
            dist[0] = Math.sqrt(Math.pow(arr[0][0]-arr[1][0], 2) + Math.pow(arr[0][1]-arr[1][1], 2));
            dist[1] = Math.sqrt(Math.pow(arr[0][0]-arr[2][0], 2) + Math.pow(arr[0][1]-arr[2][1], 2));
            dist[2] = Math.sqrt(Math.pow(arr[0][0]-arr[3][0], 2) + Math.pow(arr[0][1]-arr[3][1], 2));
            dist[3] = Math.sqrt(Math.pow(arr[1][0]-arr[2][0], 2) + Math.pow(arr[1][1]-arr[2][1], 2));
            dist[4] = Math.sqrt(Math.pow(arr[1][0]-arr[3][0], 2) + Math.pow(arr[1][1]-arr[3][1], 2));
            dist[5] = Math.sqrt(Math.pow(arr[2][0]-arr[3][0], 2) + Math.pow(arr[2][1]-arr[3][1], 2));
            Arrays.sort(dist);
            if(dist[0]==dist[1]
                &&dist[1]==dist[2]
                &&dist[2]==dist[3]
                &&dist[4]==dist[5]){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}