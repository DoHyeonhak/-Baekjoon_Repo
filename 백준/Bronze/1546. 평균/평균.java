import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float M = 0;
        float[] arr = new float[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] >= M) { M = arr[i]; }
        }
        float sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr[i]/M*100;
        }
        float avg;
        avg = sum / N;
        System.out.println(avg);
    }
}