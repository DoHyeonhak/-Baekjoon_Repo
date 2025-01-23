import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 5개 중 적어도 3개로 나누어 지는 가장 작은 자연수
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int count = 0;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1;;i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if(i%arr[j] == 0) count++;
            }
            if(count >= 3){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}